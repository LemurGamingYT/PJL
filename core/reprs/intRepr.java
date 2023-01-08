package core.reprs;

public class intRepr {
    public int value;

    public String type = "int";

    public intRepr(String value) {
        this.value = Integer.parseInt(value);
    }
}
