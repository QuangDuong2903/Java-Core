package designpattern.structural.decorator;

public class Notifier implements INotifier {
    @Override
    public void send(String msg) {
        System.out.println("Sending by mail: " + msg);
    }
}
