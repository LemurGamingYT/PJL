package core.reprs;

public class floatRepr {
    public float value;

    public String type = "float";

    public floatRepr(String value) {
        this.value = Float.parseFloat(value);
    }
}
