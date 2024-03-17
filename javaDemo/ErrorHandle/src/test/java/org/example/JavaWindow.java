package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaWindow implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        JavaWindow jw = new JavaWindow();
        jw.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void changeIt(JButton button){
        button.setText("I've been clicked!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("I've been clicked!");
    }
}
