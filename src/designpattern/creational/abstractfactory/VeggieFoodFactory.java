package designpattern.creational.abstractfactory;

public class VeggieFoodFactory implements ItalianRestaurant {
    @Override
    public Pizza createPizza() {
        return new VeggiePizza();
    }

    @Override
    public Pasta createPasta() {
        return new VeggiePasta();
    }
}
