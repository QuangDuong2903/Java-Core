package designpattern.adapter;

public class XML {

    private final String value;

    @Override
    public String toString() {
        return value + " in XML format";
    }

    public String getValue() {
        return value;
    }

    public XML(String value) {
        this.value = value;
    }
}
