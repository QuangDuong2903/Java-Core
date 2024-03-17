package designpattern.creational.builder;

public class CarManualBuilder implements Builder {

    private CarManual manual;

    @Override
    public Builder reset() {
        manual = new CarManual();
        return this;
    }

    @Override
    public Builder brand(String brand) {
        manual.setBrand(brand);
        return this;
    }

    @Override
    public Builder color(String color) {
        manual.setColor(color);
        return this;
    }

    @Override
    public Builder speed(int speed) {
        manual.setSpeed(speed);
        return this;
    }

    public CarManual build() {
        return manual;
    }
}
