package 배열;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범2 {

	public static void main(String[] args) {
		String[] movie = { "m1.PNG", "m2.PNG", "m3.PNG", "m4.PNG", "m5.PNG" };

		JFrame f = new JFrame();
		f.setTitle("나의 앨범");
		f.setSize(301, 597);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		ImageIcon icon = new ImageIcon(movie[0]);

		JLabel m = new JLabel();
		f.getContentPane().add(m);
		m.setIcon(icon);

		JButton button = new JButton("<<< 생일 >>>");
		button.setBackground(Color.YELLOW);
		button.setForeground(Color.RED);
		button.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(button);

		JButton button_1 = new JButton("<< 헬보이 >>");
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("굴림", Font.BOLD, 25));
		button_1.setBackground(Color.YELLOW);
		f.getContentPane().add(button_1);

		JButton btnmoney = new JButton("< 돈(money) >");
		btnmoney.setForeground(Color.RED);
		btnmoney.setFont(new Font("굴림", Font.BOLD, 25));
		btnmoney.setBackground(Color.YELLOW);
		f.getContentPane().add(btnmoney);

		JButton button_3 = new JButton("<<파이브피트>>");
		button_3.setForeground(Color.RED);
		button_3.setFont(new Font("굴림", Font.BOLD, 25));
		button_3.setBackground(Color.YELLOW);
		f.getContentPane().add(button_3);

		JButton button_4 = new JButton("<<< 어스 >>>");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(movie[4]);
				m.setIcon(icon);
				영화어스부품 어스 = new 영화어스부품();
				어스.어스창();
			}
		});
		button_4.setForeground(Color.RED);
		button_4.setFont(new Font("굴림", Font.BOLD, 25));
		button_4.setBackground(Color.YELLOW);
		f.getContentPane().add(button_4);

		f.setVisible(true);
	}

}
