package designpattern.structural.composite;

public abstract class Product implements Box {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
