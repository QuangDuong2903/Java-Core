package designpattern.behavioral.state;

public class Phone {

    private State state;

    public State getState() {
        return state;
    }

    public Phone() {
        this.state = new LockedState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String lock() {
        return "Locking phone and turning off screen";
    }

    public String home() {
        return "Going to home screen";
    }

    public String unlock() {
        return "Unlocking the phone home";
    }
}
