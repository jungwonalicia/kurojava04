package 배열;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화어스 {

	public void 어스창() {
		JFrame f = new JFrame();
		f.setTitle("영화 어스페이지");
		f.setSize(300, 300);
		JLabel	m = new JLabel();
		ImageIcon icon = new ImageIcon("m5.PNG");
		f.add(m);
		m.setIcon(icon);
		f.setVisible(true);
	}

}
