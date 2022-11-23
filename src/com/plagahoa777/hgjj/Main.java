package com.plagahoa777.hgjj;

import com.plagahoa777.hgjj.utils.Calculator;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // พิมพ์เล่นๆ กลัว Run console เหงา
        System.out.println("By Plagahoa777");

        // สร้าง Frame หน้าต่าง
        JFrame frame = new JFrame("หารกันจนเจอ Harn Gun Jon Jer");
        frame.setSize(640, 480);
        frame.setLayout(null);

        // สร้างตัวรับ Input
        JTextField inputTextField = new JTextField();
        inputTextField.setBounds(20, 20, 580, 50);

        // สร้างตัวแสดง Output
        JLabel outputLabel = new JLabel();
        outputLabel.setBounds(20, 150, 580, 100);

        // สร้างปุ่มและ Action
        JButton showButton = new JButton("หาเลขหารลงตัว");
        showButton.setBounds(20, 100, 580, 50);

        // Action ของปุ่มแบบ Classic
//        showButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int numerator = Integer.parseInt(inputTextField.getText());
//                String output = Calculator.getDivisibleOutput(numerator);
//                outputLabel.setText(output);
//            }
//        });

        // Action ของปุ่มแบบสั้นกว่า (Lambda)
        showButton.addActionListener(e -> {
            int numerator = Integer.parseInt(inputTextField.getText());
            String output = Calculator.getDivisibleOutput(numerator);
            outputLabel.setText(output);
        });

        // Custom Font
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("files/Sarabun-Regular.ttf"));
            Font normalCustomFont = customFont.deriveFont(Font.PLAIN, 14);
            inputTextField.setFont(normalCustomFont);
            outputLabel.setFont(normalCustomFont);
            showButton.setFont(normalCustomFont);
        } catch (FontFormatException | IOException e) {
            throw new RuntimeException(e);
        }

        // ใส่ทุกอย่างลงไปใน Frame
        frame.add(inputTextField);
        frame.add(showButton);
        frame.add(outputLabel);

        // เปิดแอพ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}