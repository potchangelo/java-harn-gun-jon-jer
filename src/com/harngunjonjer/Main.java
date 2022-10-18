package com.harngunjonjer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // สร้าง Frame หน้าต่าง
        JFrame frame = new JFrame("หารกันจนเจอ Harn Gun Jon Jer");
        frame.setSize(640, 480);
        frame.setLayout(null);

        // สร้างตัวรับ Input
        JTextField inputTextField = new JTextField();
        inputTextField.setBounds(20, 20, 580, 50);
        frame.add(inputTextField);

        // สร้างตัวแสดง Output
        JLabel outputLabel = new JLabel();
        outputLabel.setBounds(20, 150, 580, 100);

        // สร้างปุ่มและ Action
        JButton showButton = new JButton("Find divisible");
        showButton.setBounds(20, 100, 580, 50);
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numerator = Integer.parseInt(inputTextField.getText());

                String output = "Divisible denominators : ";
                for (int i = 2; i < numerator; i++) {
                    if (numerator % i == 0) {
                        output += i + ", ";
                    }
                }

                outputLabel.setText(output);
            }
        });

        // ใส่ทุกอย่างลงไปใน Frame
        frame.add(inputTextField);
        frame.add(showButton);
        frame.add(outputLabel);

        // เปิดแอพ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}