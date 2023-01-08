package core.reprs;

import core.gen.PJLParser;

import java.util.List;

public class funcRepr {
    public String name;

    public List<Object> params;

    public PJLParser.BlockContext block;

    public Object javaCallable;

    public funcRepr(String name, List<Object> params, PJLParser.BlockContext block, Object javaCallable) {
        this.name = name;
        this.params = params;
        this.block = block;
        this.javaCallable = javaCallable;
    }

    public Object Call(List<Object> args) {
        if (this.block != null) {
            return this.block;
        } else {
            return this.javaCallable;
        }
    }
}
