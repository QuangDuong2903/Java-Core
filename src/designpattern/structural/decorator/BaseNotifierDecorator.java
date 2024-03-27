package designpattern.structural.decorator;

public abstract class BaseNotifierDecorator implements INotifier {

    private INotifier wrappee;

    @Override
    public void send(String msg) {
        wrappee.send(msg);
    }

    public BaseNotifierDecorator(INotifier wrappee) {
        this.wrappee = wrappee;
    }
}
