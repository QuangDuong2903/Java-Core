package designpattern.creational.abstractfactory;

public class RomanPizza implements Pizza {
    @Override
    public void serve() {
        System.out.println("Roman Pizza is served");
    }
}
