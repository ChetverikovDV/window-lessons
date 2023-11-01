package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Мое первое окно");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JButton button = new JButton("Нажми меня!");
        button.addActionListener(e -&gt; JOptionPane.showMessageDialog(frame, "Кнопка нажата!"));
        frame.add(button, BorderLayout.SOUTH);

        JLabel label = new JLabel("Привет, мир!");
        frame.add(label, BorderLayout.NORTH);

        frame.setVisible(true);

    }
}