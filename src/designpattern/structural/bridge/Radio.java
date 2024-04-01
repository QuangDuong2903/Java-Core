package designpattern.structural.bridge;

public class Radio implements Device {
    private boolean on = false;
    @Override
    public void enable() {
        System.out.println("Enable Radio");
    }

    @Override
    public void disable() {
        System.out.println("Disable Radio");
    }

    @Override
    public boolean isEnable() {
        return on;
    }

    @Override
    public void mute() {
        System.out.println("Mute Radio");
    }
}
