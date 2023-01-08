package core;

import core.reprs.varRepr;

import java.util.HashMap;

public class Env {
    public HashMap<String, varRepr> variables = new HashMap<>();

    public void AddVariable(varRepr repr) {
        this.variables.put(repr.name, repr);
    }

    public varRepr GetVariable(String name) {
        return this.variables.get(name);
    }

    public void RemoveVariable(String name) {
        this.variables.remove(name);
    }
}
