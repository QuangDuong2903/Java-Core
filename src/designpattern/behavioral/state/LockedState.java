package designpattern.behavioral.state;

public class LockedState extends State {
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        return "State: Locked. Locked screen, cannot go to home";
    }

    @Override
    public String onOffOn() {
        phone.setState(new ReadyState(phone));
        return "State: Locked -> Ready, unlock screen";
    }
}
