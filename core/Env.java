package core;

import core.reprs.funcRepr;
import core.reprs.varRepr;

import java.util.HashMap;

public class Env {
    public HashMap<String, varRepr> variables = new HashMap<>();
    public HashMap<String, funcRepr> functions = new HashMap<>();

    public void AddVariable(varRepr repr) {
        this.variables.put(repr.name, repr);
    }

    public varRepr GetVariable(String name) {
        return this.variables.get(name);
    }

    public void SetVariable(varRepr repr) {
        this.RemoveVariable(repr.name);
        this.variables.put(repr.name, repr);
    }

    public void RemoveVariable(String name) {
        this.variables.remove(name);
    }

    public void AddFunc(funcRepr repr) {
        this.functions.put(repr.name, repr);
    }

    public funcRepr GetFunc(String name) {
        return this.functions.get(name);
    }
}
