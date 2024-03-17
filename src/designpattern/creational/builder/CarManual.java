package designpattern.creational.builder;

public class CarManual {
    private String brand;
    private String color;
    private int speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public CarManual() {
    }

    public CarManual(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "CarManual{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
