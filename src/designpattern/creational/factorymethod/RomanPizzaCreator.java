package designpattern.creational.factorymethod;

public class RomanPizzaCreator extends PizzaRestaurant {
    @Override
    public Pizza createPizza() {
        return new RomanPizza();
    }
}
