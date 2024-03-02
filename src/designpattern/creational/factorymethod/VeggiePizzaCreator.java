package designpattern.creational.factorymethod;

public class VeggiePizzaCreator extends PizzaRestaurant {
    @Override
    public Pizza createPizza() {
        return new VeggiePizza();
    }
}
