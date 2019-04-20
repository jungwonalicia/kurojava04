package 배열;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의계산기3 {

	public static void main(String[] args) {
		String[] movie = {"m1.PNG", "m2.PNG", "m3.PNG", "m4.PNG", "m5.PNG"};
		
		JFrame f = new JFrame();
		f.setTitle("나의 앨범");
		f.setSize(300, 400);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		ImageIcon icon = new ImageIcon(movie[0]);
		
		JButton b = new JButton();
		f.add(b);
		b.setIcon(icon);
		
		
		
		f.setVisible(true);
	}

}
