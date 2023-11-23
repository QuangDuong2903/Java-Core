package designpattern.adapter;

public class AnalyticsLibraryAdapter implements IAnalyticsLibrary {

    private final AnalyticsLibrary library;

    private Json convertToJson(XML xml) {
        return new Json(xml.getValue());
    }

    @Override
    public void visualize(XML value) {
        System.out.println(value);
        Json json = convertToJson(value);
        library.visualize(json);
    }

    public AnalyticsLibraryAdapter(AnalyticsLibrary library) {
        this.library = library;
    }
}
