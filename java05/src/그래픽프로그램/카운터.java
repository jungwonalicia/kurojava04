package 그래픽프로그램;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 카운터 {
	static int count = 0; //int count;
	//멤버변수는 전역변수(클래스내에 전체 영역에서 사용 가능)
	//전역변수는 자동으로 초기화
	//전역변수는 global(글로벌)
	
	public static void main(String[] args) {
		//카운터할 frame
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(325, 300);
		//배치부품 1개
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel result = new JLabel("0");
		JButton btnNewButton = new JButton("1더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				result.setText(count+"");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton.setBackground(Color.GREEN);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("0으로초기화");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				result.setText(count+"");
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("굴림", Font.BOLD, 15));
		button.setBackground(Color.BLUE);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("1빼기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--; //증감연산자.
				result.setText(count+"");
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 15));
		button_1.setBackground(Color.GREEN);
		f.getContentPane().add(button_1);
		
		result.setForeground(Color.RED);
		result.setFont(new Font("궁서", Font.BOLD, 99));
		f.getContentPane().add(result);
		
		//버튼 3개
		//라벨 1개
		
		f.setVisible(true);
	}
}
