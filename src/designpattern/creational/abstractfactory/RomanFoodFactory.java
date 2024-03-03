package designpattern.creational.abstractfactory;

public class RomanFoodFactory implements ItalianRestaurant {
    @Override
    public Pizza createPizza() {
        return new RomanPizza();
    }

    @Override
    public Pasta createPasta() {
        return new RomanPasta();
    }
}
