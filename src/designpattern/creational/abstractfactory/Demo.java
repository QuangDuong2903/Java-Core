package designpattern.creational.abstractfactory;

public class Demo {

    public static void main(String[] args) {
        Client client = new Client(new RomanFoodFactory());
        client.order();
    }
}
