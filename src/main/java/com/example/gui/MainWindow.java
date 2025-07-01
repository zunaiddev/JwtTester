package com.example.gui;

import javax.swing.*;

public class Main {
    private static JFrame frame;

    public Main() {
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void setPanel(JPanel panel) {
        frame.setContentPane(panel);
        frame.revalidate();
    }
}