package designpattern.behavioral.state;

public class Demo {

    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.getState().onHome());
        System.out.println(phone.getState().onOffOn());
        System.out.println(phone.getState().onHome());
        System.out.println(phone.getState().onOffOn());
    }
}
