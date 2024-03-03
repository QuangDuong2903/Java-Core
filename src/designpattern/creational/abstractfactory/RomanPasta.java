package designpattern.creational.abstractfactory;

public class RomanPasta implements Pasta {
    @Override
    public void serve() {
        System.out.println("Roman pasta is served");
    }
}
