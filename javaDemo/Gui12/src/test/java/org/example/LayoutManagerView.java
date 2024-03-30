package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutManagerView implements ActionListener {
    JTextArea textArea;
    public static void main(String[] args) {
        LayoutManagerView view = new LayoutManagerView();
//        view.goBoxLayout();
        view.goTextArea();
    }

    void goTextArea() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("点击添加数据");
        button.addActionListener(this);
        textArea = new JTextArea(10, 20);
        textArea.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        panel.add(scrollPane);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    void goBoxLayout() {
        /**
         * @description swing box layout
         */
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JButton button1 = new JButton("button1");
        JButton button2 = new JButton("button2");
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    void goBorder() {
        /**
         * @description swing  test
         */
        JFrame frame = new JFrame();
        JButton button = new JButton("你好");
//        JButton buuton1 = new JButton("你好，世界");
        JButton center = new JButton("Center");
        JButton left = new JButton("left");
        JPanel myPanel = new JPanel();
        myPanel.add(BorderLayout.EAST, button);
//        myPanel.add(BorderLayout.EAST, buuton1);
        frame.getContentPane().add(BorderLayout.EAST, myPanel);
        frame.getContentPane().add(BorderLayout.CENTER, center);
        frame.getContentPane().add(BorderLayout.WEST, left);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }


    void goFlow() {
        /**
         * @description swing flow layout
         */
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        JButton button1 = new JButton("button1");
        JButton button2 = new JButton("button2");
        JButton button3 = new JButton("button33213123123123");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textArea.append("button clicked\n");
    }
}
