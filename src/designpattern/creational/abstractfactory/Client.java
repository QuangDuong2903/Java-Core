package designpattern.creational.abstractfactory;

public class Client {

    private final ItalianRestaurant restaurant;

    public Client(ItalianRestaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void order() {
        restaurant.createPizza();
        restaurant.createPasta();
    }
}
