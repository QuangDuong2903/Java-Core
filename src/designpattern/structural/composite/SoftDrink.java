package designpattern.structural.composite;

public class SoftDrink extends Product {
    @Override
    public double calculatePrice() {
        return price * 1.1;
    }

    public SoftDrink(String name, double price) {
        super(name, price);
    }
}
