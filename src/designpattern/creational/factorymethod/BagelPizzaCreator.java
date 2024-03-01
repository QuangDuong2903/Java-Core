package designpattern.creational.factorymethod;

public class BagelPizzaCreator extends PizzaRestaurant {
    @Override
    public Pizza createPizza() {
        return new BagelPizza();
    }
}
