package designpattern.behavioral.state;

public class Demo {

    public static void main(String[] args) {
        Phone phone = new Phone();
        UI ui = new UI(phone);
        ui.init();
    }
}
