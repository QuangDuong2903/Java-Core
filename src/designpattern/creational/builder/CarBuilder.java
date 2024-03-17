package designpattern.creational.builder;

public class CarBuilder implements Builder {

    private Car car;

    @Override
    public Builder reset() {
        car = new Car();
        return this;
    }

    @Override
    public Builder brand(String brand) {
        car.setBrand(brand);
        return this;
    }

    @Override
    public Builder color(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Builder speed(int speed) {
        car.setSpeed(speed);
        return this;
    }

    public Car build() {
        return car;
    }
}
