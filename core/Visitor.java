package core;


import core.gen.PJLBaseVisitor;
import core.gen.PJLParser;
import core.reprs.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Visitor<T> extends PJLBaseVisitor<T> {
    public static void FUNC_Println(List<?> args) {
        var value = args.get(0);

        if (value instanceof stringRepr r) {
            System.out.println(r.value);
        } else if (value instanceof intRepr r) {
            System.out.println(r.value);
        } else if (value instanceof idRepr r) {
            System.out.println(r.value);
        } else if (value instanceof floatRepr r) {
            System.out.println(r.value);
        } else if (value instanceof boolRepr r) {
            System.out.println(r.value);
        } else if (value instanceof nullRepr r) {
            System.out.println(r.value);
        }
    }

    public static stringRepr FUNC_Input(List<?> args) {
        var value = args.get(0);

        if (!(value instanceof stringRepr)) {
            new Error("Type",
                    "function 'Input' requires an argument one of type 'string'");
        } else {
            Scanner input = new Scanner(System.in);

            System.out.print(((stringRepr) value).value);

            String out = input.nextLine();

            return new stringRepr(out);
        }

        return null;
    }

    private static final Map<Integer, Integer> fibCache = new HashMap<>();

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            if (fibCache.containsKey(n)) {
                return fibCache.get(n);
            } else {
                int result = fib(n - 1) + fib(n - 2);
                fibCache.put(n, result);
                return result;
            }
        }
    }

    public static intRepr FUNC_fib(List<?> args) {
        int result = fib(((intRepr) args.get(0)).value);

        return new intRepr(Integer.toString(result));
    }

    List<String> funcs;

    HashMap<String, Class<?>> reprs = new HashMap<>();

    public void Init() {
        this.reprs.put("id", idRepr.class);
        this.reprs.put("string", stringRepr.class);
        this.reprs.put("int", intRepr.class);
        this.reprs.put("bool", boolRepr.class);
        this.reprs.put("float", floatRepr.class);
        this.reprs.put("null", nullRepr.class);

        var cfuncs = Arrays.stream(Visitor.class.getDeclaredMethods())
                .filter(method -> method.getName().startsWith("FUNC_"))
                .toList();

        List<String> NewArray = new ArrayList<>();
        for (Method func : cfuncs) {
            NewArray.add(func.getName());
        }

        this.funcs = NewArray;
    }

    public Env env = new Env();

    @SuppressWarnings("unchecked")
    public T visitParams(PJLParser.ParamsContext ctx) {
        List<Object> params = new ArrayList<>();
        if (ctx != null) {
            for (int i = 0; i < ctx.ID().size(); i++) {
                Object value = ctx.ID(i).toString();

                params.add(value);
            }
        } else {
            params.add(null);
        }

        return (T) params;
    }

    @SuppressWarnings("unchecked")
    public T visitArgs(PJLParser.ArgsContext ctx) {
        List<Object> args = new ArrayList<>();
        if (ctx != null) {
            for (int i = 0; i < ctx.expr().size(); i++) {
                Object value = this.visitExpr(ctx.expr(i));

                if (value instanceof idRepr val) {
                    args.add(this.env.GetVariable(val.value).value);
                } else {
                    args.add(value);
                }
            }
        } else {
            args.add(null);
        }

        return (T) args;
    }

    @SuppressWarnings("unchecked")
    public T visitCall(PJLParser.CallContext ctx) {
        var name = ctx.ID().toString();
        var args = (List<Class<?>>) visitArgs(ctx.args());

        if (this.funcs.contains("FUNC_" + name)) {
            name = "FUNC_" + name;
            try {
                Method method = Visitor.class.getMethod(name, List.class);
                return (T) method.invoke(new Visitor<Object>(), args);
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        } else if (this.env.functions.containsKey(name)) {
            funcRepr repr = this.env.GetFunc(name);
            var out = repr.Call(args);

            if (out instanceof PJLParser.BlockContext c) {
                visitBlock(c);
            } else {
                new Error("Call", "Unknown error occurred while calling '" + name + "'");
            }
        } else {
            new Error("Unbound", "Unknown function '" + name + "'");
        }

        return null;
    }

    public T visitVar_assignment(PJLParser.Var_assignmentContext ctx) {
        var name = ctx.ID().toString();
        var expr = visitExpr(ctx.expr());
        var constant = name.toUpperCase().equals(name);

        this.env.AddVariable(new varRepr(name, expr, constant));

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitFunc_assignment(PJLParser.Func_assignmentContext ctx) {
        var name = ctx.ID().toString();
        var params = (List<Object>) visitParams(ctx.params());
        var block = ctx.block();

        this.env.AddFunc(new funcRepr(name, params, block, null));

        return null;
    }

    public T visitFor_stmt(PJLParser.For_stmtContext ctx) {
        try {
            boolRepr condition = (boolRepr) visitExpr(ctx.expr());

            varRepr counter = new varRepr(ctx.ID(0).getText(), new intRepr("0"), false);
            this.env.AddVariable(counter);

            while (condition.value) {
                visitBlock(ctx.block());

                if (Objects.equals(ctx.DUALOPS().getText(), "++")) {
                    this.env.SetVariable(new varRepr(counter.name,
                            new intRepr((String) counter.value + 1), false));
                } else if (Objects.equals(ctx.DUALOPS().getText(), "--")) {
                    int newVal = Integer.parseInt((String) counter.value);
                    this.env.SetVariable(new varRepr(counter.name,
                            new intRepr(Integer.toString(newVal - 1)), false));
                }

                try {
                    condition = (boolRepr) visitExpr(ctx.expr());
                } catch (ClassCastException e) {
                    new Error("Type", "Conditions must evaluate to a boolean");
                }
            }

            this.env.RemoveVariable(counter.name);
        } catch (ClassCastException e) {
            new Error("Type", "Conditions must evaluate to a boolean");
        }

        return null;
    }

    public T visitWhile_stmt(PJLParser.While_stmtContext ctx) {
        try {
            boolRepr condition = (boolRepr) visitConditional_block(ctx.conditional_block());

            while (condition.value) {
                visitBlock(ctx.block());

                try {
                    condition = (boolRepr) visitConditional_block(ctx.conditional_block());
                } catch (ClassCastException e) {
                    new Error("Type", "Conditions must evaluate to a boolean");
                }
            }
        } catch (ClassCastException e) {
            new Error("Type", "Conditions must evaluate to a boolean");
        }

        return null;
    }

    public T visitIf_stmt(PJLParser.If_stmtContext ctx) {
        try {
            boolRepr condition = (boolRepr) visitConditional_block(ctx.conditional_block(0));

            if (condition.value) {
                visitBlock(ctx.block(0));
            } else {
                if (ctx.IF().size() > 1) {
                    for (int i = 0; i < ctx.IF().size(); i++) {
                        try {
                            boolRepr c = (boolRepr) visitConditional_block(ctx.conditional_block(i));

                            if (c.value) {
                                visitBlock(ctx.block(i));
                            }
                        } catch (ClassCastException e) {
                            new Error("Type", "Conditions must evaluate to a boolean");
                        }
                    }
                } else if (ctx.ELSE().size() == 1 && ctx.IF().size() == 1) {
                    visitBlock(ctx.block(1));
                }
            }
        } catch (ClassCastException e) {
            new Error("Type", "Conditions must evaluate to a boolean");
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitConditional_block(PJLParser.Conditional_blockContext ctx) {
        try {
            boolRepr expr = (boolRepr) visitExpr(ctx.expr());

            return (T) expr;
        } catch (ClassCastException e) {
            new Error("Type", "Conditions must evaluate to a boolean");
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitExpr(PJLParser.ExprContext ctx) {
        if (ctx.atom() != null) {
            return visitAtom(ctx.atom());
        } else if (ctx.call() != null) {
            return visitCall(ctx.call());
        } else if (ctx.expr().size() == 2 && ctx.op != null) {
            var op = ctx.op.getText();

            var e1 = visitExpr(ctx.expr(0));
            var e2 = visitExpr(ctx.expr(1));

            HashMap<String, String> operators = new HashMap<>();
            operators.put("+", "add");
            operators.put("-", "sub");
            operators.put("*", "mul");
            operators.put("/", "div");
            operators.put("%", "mod");
            operators.put("**", "pow");

            try {
                Method method = e1.getClass().getMethod(operators.get(op), Object.class);
                var out = method.invoke(e1, e2);

                return (T) out;
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        return null;
    }

    @SuppressWarnings("unchecked")
    public T visitAtom(PJLParser.AtomContext ctx) {
        var atoms = new HashMap<String, Object>();
        atoms.put("id", ctx.ID());
        atoms.put("string", ctx.STRING());
        atoms.put("int", ctx.INT());
        atoms.put("bool", ctx.BOOL());
        atoms.put("float", ctx.FLOAT());
        atoms.put("null", ctx.NULL());

        for (String key : atoms.keySet()) {
            if (reprs.containsKey(key) && atoms.get(key) != null) {
                var value = atoms.get(key).toString();
                var repr = reprs.get(key);

                try {
                    var field = repr.getField("value");
                    field.setAccessible(true);

                    Constructor<?> constructor = repr.getConstructor(String.class);
                    return (T) constructor.newInstance(value);
                } catch (NoSuchFieldException | NoSuchMethodException | InvocationTargetException |
                         InstantiationException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return null;
    }
}
