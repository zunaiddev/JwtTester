package com.example.gui;

import com.example.Common;

import javax.swing.*;
import java.awt.*;

public class Decoder {
    private final JPanel panel;

    public Decoder() {
        this.panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60)); // padding inside panel

        // Title Label
        JLabel label = Common.getLabel("Token");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(label);

        panel.add(Box.createRigidArea(new Dimension(0, 30))); // vertical space

        // Input and Button Panel
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        inputPanel.setOpaque(false); // so it inherits black background

        JTextField input = Common.getInputField();
        input.setPreferredSize(new Dimension(250, 30));

        JButton submitBtn = Common.getButton("Submit");
        submitBtn.setPreferredSize(new Dimension(120, 30));

        inputPanel.add(input);
        inputPanel.add(submitBtn);

        panel.add(inputPanel);
    }

    public JPanel getPanel() {
        return this.panel;
    }
}