package designpattern.adapter;

public class Json {

    private final String value;

    @Override
    public String toString() {
        return value + " in JSON format";
    }

    public Json(String value) {
        this.value = value;
    }
}
