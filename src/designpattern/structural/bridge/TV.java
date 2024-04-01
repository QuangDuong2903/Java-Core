package designpattern.structural.bridge;

public class TV implements Device {
    private boolean on = false;

    @Override
    public void enable() {
        System.out.println("Enable TV");
    }

    @Override
    public void disable() {
        System.out.println("Disable TV");
    }

    @Override
    public boolean isEnable() {
        return on;
    }

    @Override
    public void mute() {
        System.out.println("Mute TV");
    }
}
