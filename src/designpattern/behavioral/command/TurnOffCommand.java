package designpattern.behavioral.command;

public class TurnOffCommand implements Command {

    private TV tv;

    @Override
    public String execute() {
        return tv.turnOff();
    }

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }
}
