package designpattern.structural.composite;

public class Milk extends Product {
    public Milk(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
