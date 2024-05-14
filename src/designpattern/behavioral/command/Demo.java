package designpattern.behavioral.command;

import javax.swing.*;
import java.awt.*;

public class Demo {

    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote();

        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);

        JFrame frame = new JFrame("Television");
        JPanel content = new JPanel();

        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel label = new JLabel("Hello!");
        frame.getContentPane().add(label);

        JButton turnOn = new JButton("Turn on");
        JButton turnOff = new JButton("Turn off");

        turnOn.addActionListener(e -> {
            remote.setCommand(turnOnCommand);
            label.setText(remote.press());
        });
        turnOff.addActionListener(e -> {
            remote.setCommand(turnOffCommand);
            label.setText(remote.press());
        });

        buttons.add(turnOn);
        buttons.add(turnOff);
        content.add(buttons);

        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
