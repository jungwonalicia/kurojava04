package 배열;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의계산기3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 계산기");
		f.setSize(300, 300);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		
		JButton b1 = new JButton("나를 눌러요.");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나를 눌렀군요...");
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 40));
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.GREEN);
		f.getContentPane().add(b1);
		JButton b2 = new JButton("나도 눌러요.");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나도 눌러졌군요...");
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 40));
		b2.setBackground(Color.ORANGE);
		b2.setForeground(Color.RED);
		f.getContentPane().add(b2);
		
		
		
		
		
		f.setVisible(true);
	}

}
