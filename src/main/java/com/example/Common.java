package com.example;

import javax.swing.*;
import java.awt.*;

public class Common {
    public static JTextField getInputField() {
        JTextField textField = new JTextField();
        textField.setMaximumSize(new Dimension(300, 30));
        textField.setBackground(new Color(50, 50, 50));
        textField.setForeground(Color.WHITE);
        textField.setCaretColor(Color.WHITE);
        textField.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        textField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY),
                BorderFactory.createEmptyBorder(7, 10, 7, 10)
        ));

        return textField;
    }

    public static JButton getButton(String text) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setBackground(new Color(70, 70, 70));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        button.setPreferredSize(new Dimension(150, 30));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        return button;
    }

    public static JLabel getLabel(String text) {
        JLabel label = new JLabel(text);
        label.setForeground(Color.WHITE);

        return label;
    }
}