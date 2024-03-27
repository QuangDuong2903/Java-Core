package designpattern.structural.decorator;

public class Demo {

    public static void main(String[] args) {
        INotifier notifier = new FacebookNotifierDecorator(
                new ZaloNotifierDecorator(
                        new Notifier()
                )
        );
        notifier.send("Hello");
    }
}
