package designpattern.structural.decorator;

public class ZaloNotifierDecorator extends BaseNotifierDecorator {

    @Override
    public void send(String msg) {
        super.send(msg);
        System.out.println("Sending by Zalo: " + msg);
    }

    public ZaloNotifierDecorator(INotifier wrappee) {
        super(wrappee);
    }
}
