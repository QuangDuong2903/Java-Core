package designpattern.adapter;

public class StockMarketClient {

    public XML getMetrics() {
        return new XML("10.000$");
    }
}
