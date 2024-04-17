package designpattern.behavioral.state;

public class ReadyState extends State {
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return "State: Ready. Go to home screen";
    }

    @Override
    public String onOffOn() {
        phone.setState(new LockedState(phone));
        return "State: Ready -> Locked. Locking screen";
    }
}
