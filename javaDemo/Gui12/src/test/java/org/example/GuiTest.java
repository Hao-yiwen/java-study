package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTest implements ActionListener {
    JFrame frame;
    JButton button;

    public static void main(String[] args) {
        GuiTest test = new GuiTest();
        test.go();
    }

    public void go() {
        frame = new JFrame();
        button = new JButton("click me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I have been clicked");
    }
}
