package designpattern.structural.decorator;

public class FacebookNotifierDecorator extends BaseNotifierDecorator {

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending by Facebook: " + msg);
    }

    public FacebookNotifierDecorator(INotifier wrappee) {
        super(wrappee);
    }
}
