package com.example;

import javax.swing.*;

public class Toast {
    public static void error(JFrame frame, String text) {
        JOptionPane.showMessageDialog(frame, "text", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
