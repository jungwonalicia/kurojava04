package 배열;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의계산기4 {
	private static JTextField n1;
	private static JTextField n2;

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setTitle("나의 계산기");
		f.setSize(318, 381);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("숫자1>> ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(lblNewLabel);
		
		n1 = new JTextField();
		n1.setBackground(Color.ORANGE);
		n1.setForeground(Color.RED);
		n1.setFont(new Font("굴림", Font.BOLD, 28));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label = new JLabel("숫자2>> ");
		label.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(label);
		
		n2 = new JTextField();
		n2.setForeground(Color.RED);
		n2.setFont(new Font("굴림", Font.BOLD, 28));
		n2.setColumns(10);
		n2.setBackground(Color.ORANGE);
		f.getContentPane().add(n2);
		
		JButton plus = new JButton("+");
		JLabel result = new JLabel("");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nn1 = n1.getText();
				String nn2 = n2.getText();
				
				int num1 = Integer.parseInt(nn1);
				int num2 = Integer.parseInt(nn2);
				result.setText(num1+num2+"");
				System.out.println(num1+num2);
			}
		});
		plus.setBackground(Color.RED);
		plus.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nn1 = n1.getText();
				String nn2 = n2.getText();
				
				int num1 = Integer.parseInt(nn1);
				int num2 = Integer.parseInt(nn2);
				result.setText(num1-num2+"");
				System.out.println(num1-num2);
			}
		});
		minus.setFont(new Font("굴림", Font.BOLD, 50));
		minus.setBackground(Color.RED);
		f.getContentPane().add(minus);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nn1 = n1.getText();
				String nn2 = n2.getText();
				
				int num1 = Integer.parseInt(nn1);
				int num2 = Integer.parseInt(nn2);
				result.setText(num1*num2+"");
				System.out.println(num1*num2);
			}
		});
		mul.setFont(new Font("굴림", Font.BOLD, 50));
		mul.setBackground(Color.RED);
		f.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nn1 = n1.getText();
				String nn2 = n2.getText();
				
				int num1 = Integer.parseInt(nn1);
				int num2 = Integer.parseInt(nn2);
				result.setText(num1/num2+"");
				System.out.println(num1/num2);
			}
		});
		div.setFont(new Font("굴림", Font.BOLD, 50));
		div.setBackground(Color.RED);
		f.getContentPane().add(div);
		
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(result);
		
		f.setVisible(true);
	}

}







