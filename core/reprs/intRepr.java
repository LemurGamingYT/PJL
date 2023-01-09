package core.reprs;

import core.Error;

import java.util.Objects;

public class intRepr {
    public int value;

    public String type = "int";

    public intRepr(String value) {
        this.value = Integer.parseInt(value);
    }

    public Object add(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Integer.toString(this.value + r.value));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString(this.value + r.value));
        } else {
            new Error("Type", "Incompatible addition types, must be 'int' or 'float' types");
        }

        return null;
    }

    public Object sub(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Integer.toString(this.value - r.value));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString(this.value - r.value));
        } else {
            new Error("Type", "Incompatible subtraction types, must be 'int' or 'float' types");
        }

        return null;
    }

    public Object mul(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Integer.toString(this.value * r.value));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString(this.value * r.value));
        } else {
            new Error("Type", "Incompatible multiplication types, must be 'int' or 'float' types");
        }

        return null;
    }

    public Object div(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Integer.toString(this.value / r.value));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString(this.value / r.value));
        } else {
            new Error("Type", "Incompatible division types, must be 'int' or 'float' types");
        }

        return null;
    }

    public Object mod(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Integer.toString(this.value % r.value));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString(this.value % r.value));
        } else {
            new Error("Type", "Incompatible modulo types, must be 'int' or 'float' types");
        }

        return null;
    }

    public Object pow(Object other) {
        if (other instanceof intRepr r) {
            return new intRepr(Integer.toString((int) Math.pow(this.value, r.value)));
        } else if (other instanceof floatRepr r) {
            return new floatRepr(Float.toString((float) Math.pow(this.value, r.value)));
        } else {
            new Error("Type", "Incompatible power types, must be 'int' or 'float' types");
        }

        return null;
    }
}
