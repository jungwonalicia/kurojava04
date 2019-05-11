package 인터페이스;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow extends JFrame implements ActionListener{
	JButton b, b2;
	
	public MyWindow() {
		setTitle("나의 윈도우");
		setSize(300, 300);
		b = new JButton("나는 버튼1");
		b2 = new JButton("나는 버튼2");
		JLabel	l = new JLabel("나는 라벨");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		b.addActionListener(this);
		b2.addActionListener(this);
		add(b);
		add(b2);
		add(l);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyWindow name = new MyWindow();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			System.out.println("버튼을 눌렀군요.");
		}else {
			System.out.println("버튼2를 눌렀군요.");
		}
	}

}






