package designpattern.behavioral.state;

public class ReadyState extends State {
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        System.out.print("State: Ready, ");
        return phone.home();
    }

    @Override
    public String onOffOn() {
        System.out.print("State: Ready -> Locked, ");
        phone.setState(new LockedState(phone));
        return phone.lock();
    }
}
