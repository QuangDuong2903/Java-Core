package designpattern.creational.factorymethod;

public class VeggiePizza implements Pizza {
    @Override
    public void serve() {
        System.out.println("Veggie pizza is served");
    }
}
