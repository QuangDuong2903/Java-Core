package designpattern.behavioral.command;

public class TurnOnCommand implements Command {

    private TV tv;

    @Override
    public String execute() {
        return tv.turnOn();
    }

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }
}
