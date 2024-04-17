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

    public String onHome() {
        return state.onHome();
    }

    public String onOffOn() {
        return state.onOffOn();
    }
}
