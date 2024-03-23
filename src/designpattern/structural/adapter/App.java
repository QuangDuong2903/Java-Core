package designpattern.structural.adapter;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        StockMarketClient stockMarketClient = new StockMarketClient();
        // AnalyticsLibrary analyticsLibrary = new AnalyticsLibrary();
        // analyticsLibrary.visualize(stockMarketClient.getMetrics()); // not compatible
        IAnalyticsLibrary analyticsLibrary = new AnalyticsLibraryAdapter(new AnalyticsLibrary());
        analyticsLibrary.visualize(stockMarketClient.getMetrics());
    }
}
