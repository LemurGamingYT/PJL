package core;


import core.gen.PJLBaseVisitor;
import core.gen.PJLParser;
import core.reprs.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Visitor<T> extends PJLBaseVisitor<T> {
    public static void FUNC_Println(List<Object> args) {
        Object value = args.get(0);

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

    public static stringRepr FUNC_Input(List<Object> args) {
        var value = args.get(0);

        if (!(value instanceof stringRepr)) {
            new Error("Type", "function 'Input' requires an argument one of type 'string'");
        } else {
            Scanner input = new Scanner(System.in);

            if (value instanceof stringRepr) System.out.print(((stringRepr) value).value);

            String out = input.nextLine();

            return new stringRepr(out);
        }

        return null;
    }

    List<String> funcs;

    HashMap<String, Class<?>> reprs = new HashMap<>();

    public void SetReprs() {
        this.reprs.put("id", idRepr.class);
        this.reprs.put("string", stringRepr.class);
        this.reprs.put("int", intRepr.class);
        this.reprs.put("bool", boolRepr.class);
        this.reprs.put("float", floatRepr.class);
        this.reprs.put("null", nullRepr.class);
    }

    public void SetFuncs() {
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

    public T visitParams(PJLParser.ParamsContext ctx) {
        return null;
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

    public T visitCall(PJLParser.CallContext ctx) {
        var name = ctx.ID().toString();
        var args = (List<?>) visitArgs(ctx.args());

        if (this.funcs.contains("FUNC_" + name)) {
            name = "FUNC_" + name;
            try {
                Method method = Visitor.class.getMethod(name, List.class);
                method.invoke(new Visitor<Object>(), args);
            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                throw new RuntimeException(e);
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

    public T visitExpr(PJLParser.ExprContext ctx) {
        if (ctx.atom() != null) {
            return visitAtom(ctx.atom());
        } else if (ctx.call() != null) {
            return visitCall(ctx.call());
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
