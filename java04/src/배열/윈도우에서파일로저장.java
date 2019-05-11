package 배열;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 윈도우에서파일로저장 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setTitle("오늘의 일기 저장");
		f.setSize(375, 299);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.BLUE);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setForeground(Color.BLUE);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel label = new JLabel("오늘의 제목");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(label);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBackground(Color.YELLOW);
		f.getContentPane().add(t2);
		
		JLabel label_1 = new JLabel("오늘의 내용");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(label_1);
		
		JTextArea t3 = new JTextArea();
		t3.setBackground(Color.YELLOW);
		t3.setRows(5);
		t3.setColumns(25);
		f.getContentPane().add(t3);
		
		JButton b = new JButton("오늘의 일기 저장");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();//날짜
				String t22 = t2.getText();//제목
				String t33 = t3.getText();//내용
				try {
					FileWriter f = new FileWriter(t11+".txt");
					f.write(t11+"\n");
					f.write(t22+"\n");
					f.write(t33+"\n");
					f.close();
				} catch (IOException e1) {
				}
			}
		});
		b.setForeground(Color.RED);
		b.setBackground(Color.YELLOW);
		b.setFont(new Font("굴림", Font.BOLD, 26));
		f.getContentPane().add(b);
		f.setVisible(true);
	}

}
