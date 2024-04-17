package designpattern.behavioral.state;

public class LockedState extends State {
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        System.out.print("State: Locked, ");
        return "Locked screen, cannot go to home";
    }

    @Override
    public String onOffOn() {
        System.out.print("State: Locked -> Ready, ");
        phone.setState(new ReadyState(phone));
        return phone.unlock();
    }
}
