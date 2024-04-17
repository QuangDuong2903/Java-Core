package designpattern.behavioral.state;

import javax.swing.*;
import java.awt.*;

public class UI {
    private Phone phone;
    private static JTextField textField = new JTextField();

    public UI(Phone phone) {
        this.phone = phone;
    }

    public void init() {
        JFrame frame = new JFrame("Test phone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        // Context delegates handling user's input to a state object. Naturally,
        // the outcome will depend on what state is currently active, since all
        // states can handle the input differently.
        JButton home = new JButton("Home");
        home.addActionListener(e -> textField.setText(phone.onHome()));
        JButton onoff = new JButton("On - Off");
        onoff.addActionListener(e -> textField.setText(phone.onOffOn()));
        frame.setVisible(true);
        frame.setSize(300, 100);
        buttons.add(home);
        buttons.add(onoff);
    }
}
