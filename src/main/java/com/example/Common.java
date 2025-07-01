package com.example;

import javax.swing.*;
import java.awt.*;

public class Utils {
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
}
