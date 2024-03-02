package designpattern.creational.factorymethod;

public class Demo {

    public static void main(String[] args) {
        PizzaRestaurant romanRestaurant = new RomanPizzaCreator();
        Pizza romanPizza = romanRestaurant.orderPizza();
        PizzaRestaurant veggieRestaurant = new VeggiePizzaCreator();
        Pizza bagelPizza = veggieRestaurant.orderPizza();
    }
}
