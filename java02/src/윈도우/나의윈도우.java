package ������;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class ���������� {
	private static JTextField textField;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setTitle("���� ������ ���α׷�");
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		btnNewButton.setFont(new Font("����", Font.ITALIC, 30));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBackground(new Color(255, 0, 255));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uB098\uB294 \uC704\uBC84\uD2BC");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 18));
		btnNewButton_1.setForeground(Color.GREEN);
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setBackground(Color.YELLOW);
		textField.setForeground(Color.RED);
		textField.setFont(new Font("����", Font.BOLD, 20));
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(20);
		f.setVisible(true);
	}

}
