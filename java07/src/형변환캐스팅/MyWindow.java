package 형변환캐스팅;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow extends JFrame {

	public MyWindow() {
		setTitle("나의 윈도우");
		setSize(300, 300);
		JButton b = new JButton("나는 버튼");
		JLabel	l = new JLabel("나는 라벨");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWindow name = new MyWindow();
	}

}
