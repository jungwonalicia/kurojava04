package 배열;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class 나의계산기4 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setTitle("나의 계산기");
		f.setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("숫자1>> ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.ORANGE);
		textField.setForeground(Color.RED);
		textField.setFont(new Font("굴림", Font.BOLD, 28));
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("숫자2>> ");
		label.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("굴림", Font.BOLD, 28));
		textField_1.setColumns(10);
		textField_1.setBackground(Color.ORANGE);
		f.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton);
		
		f.setVisible(true);
	}

}







