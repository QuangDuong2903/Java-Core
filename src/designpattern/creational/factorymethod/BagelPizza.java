package designpattern.creational.factorymethod;

public class BagelPizza implements Pizza {
    @Override
    public void serve() {
        System.out.println("Bagel pizza is served");
    }
}
