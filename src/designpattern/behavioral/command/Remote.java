package designpattern.behavioral.command;

// Invoker
public class Remote {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String press() {
        return command.execute();
    }
}
    