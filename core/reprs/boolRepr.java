package core.reprs;

public class boolRepr {
    public boolean value;

    public String type = "bool";

    public boolRepr(String value) {
        this.value = Boolean.parseBoolean(value);
    }
}
