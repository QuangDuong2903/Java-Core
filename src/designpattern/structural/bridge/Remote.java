package designpattern.structural.bridge;

public class Remote {
    protected final Device device;

    public Remote(Device device) {this.device = device;}

    public void togglePower() {
        if (device.isEnable())
            device.disable();
        else
            device.enable();
    }
}
