package org.example;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        /*
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);*/
        /**
         * @description: Draw a gradient
         */
        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradientPaint = new GradientPaint(50, 50, startColor, 150, 150, endColor);
        g2d.setPaint(gradientPaint);
        g2d.fillOval(50, 50, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.getContentPane().add(new MyDrawPanel());
        frame.setVisible(true);
    }
}
