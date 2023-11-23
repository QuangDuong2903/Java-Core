package designpattern.adapter;

public class App {

    public static void main(String[] args) {
        StockMarketClient stockMarketClient = new StockMarketClient();
        // AnalyticsLibrary analyticsLibrary = new AnalyticsLibrary();
        // analyticsLibrary.visualize(stockMarketClient.getMetrics()); // not compatible
        IAnalyticsLibrary analyticsLibrary = new AnalyticsLibraryAdapter(new AnalyticsLibrary());
        analyticsLibrary.visualize(stockMarketClient.getMetrics());
    }
}
