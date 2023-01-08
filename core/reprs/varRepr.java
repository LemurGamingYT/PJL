package core.reprs;

public class varRepr {
    public String name;
    public Object value;

    public boolean constant;

    public varRepr(String name, Object value, boolean constant) {
        this.name = name;
        this.value = value;
        this.constant = constant;
    }
}
