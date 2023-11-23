package designpattern.builder.concreate;

import designpattern.builder.builder.HouseBuilder;
import designpattern.builder.product.House;

public class BungalowBuilder implements HouseBuilder {

    private final House house;

    public BungalowBuilder() {
        this.house = new House();
    }

    @Override
    public void floor() {
        house.setDoor(1);
    }

    @Override
    public void area() {
        house.setArea(50);
    }

    @Override
    public void door() {
        house.setDoor(1);
    }

    @Override
    public void window() {
        house.setWindow(4);
    }

    @Override
    public House get() {
        return house;
    }
}
