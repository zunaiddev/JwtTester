package com.example.gui;

import javax.swing.*;

public class MainWindow {
    private static JFrame frame;
    private final JPanel decoderPane = new Decoder().getPanel();

    public MainWindow() {
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(decoderPane);
        frame.setVisible(true);
    }

    public static void setPanel(JPanel panel) {
        frame.setContentPane(panel);
        frame.revalidate();
    }
}