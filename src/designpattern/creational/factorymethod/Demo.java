package designpattern.creational.factorymethod;

public class Demo {

    public static void main(String[] args) {
        PizzaRestaurant romanRestaurant = new RomanPizzaCreator();
        Pizza romanPizza = romanRestaurant.orderPizza();
        PizzaRestaurant bagelRestaurant = new BagelPizzaCreator();
        Pizza bagelPizza = bagelRestaurant.orderPizza();
    }
}
