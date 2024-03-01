package designpattern.creational.factorymethod;

public abstract class PizzaRestaurant {

    public Pizza orderPizza() {
        Pizza pizza = createPizza();
        pizza.serve();
        return pizza;
    }

    public abstract Pizza createPizza();

}
