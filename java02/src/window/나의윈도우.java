package window;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class 나의윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(502, 617);
		f.setTitle("나의 첫 그래픽");
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("회원가입화면입니다.");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 46));
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("아이디");
		label.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("패스워드");
		label_1.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.BOLD, 30));
		textField_1.setColumns(10);
		f.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("회원이름");
		label_2.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("굴림", Font.BOLD, 30));
		textField_2.setColumns(10);
		f.getContentPane().add(textField_2);
		
		JLabel label_3 = new JLabel("회원전화");
		label_3.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("굴림", Font.BOLD, 30));
		textField_3.setColumns(10);
		f.getContentPane().add(textField_3);
		
		JButton btnNewButton = new JButton("회원가입처리");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("db서버로 데이터 전송...");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 55));
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\alicia\\java02\\1.png"));
		f.getContentPane().add(lblNewLabel_1);
		
		f.setVisible(true);		
	}

}
