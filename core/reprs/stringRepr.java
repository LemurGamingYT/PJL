package core.reprs;

public class stringRepr {
    public String value;
    public String type = "string";

    public stringRepr(String value) {
        this.value = value.substring(1, value.length() - 1);
    }

    public String lower() {
        return this.value.toLowerCase();
    }
}
