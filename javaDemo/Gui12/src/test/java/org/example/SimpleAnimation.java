package org.example;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {
    int x = 70;
    int y = 70;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        MyDrawPanel panel = new MyDrawPanel();
        TestDrawPanel panel = new TestDrawPanel();
        frame.getContentPane().add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            panel.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }


    class TestDrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.orange);
            g.fillOval(x, y, 40, 40);
        }
    }
}
