package designpattern.creational.abstractfactory;

public class VeggiePizza implements Pizza {
    @Override
    public void serve() {
        System.out.println("Veggie pizza is served");
    }
}
