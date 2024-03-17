package designpattern.creational.builder;

public interface Builder {
    Builder reset();
    Builder brand(String brand);
    Builder color(String color);
    Builder speed(int speed);
}
