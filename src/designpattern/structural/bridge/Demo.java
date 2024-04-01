package designpattern.structural.bridge;

public class Demo {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();

        Remote remote = new Remote(tv);
        remote.togglePower();
        remote = new Remote(radio);
        remote.togglePower();

        AdvancedRemote advancedRemote = new AdvancedRemote(tv);
        advancedRemote.mute();
        advancedRemote = new AdvancedRemote(radio);
        advancedRemote.mute();
    }
}
