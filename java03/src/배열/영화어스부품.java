package 배열;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화어스부품 {
	public void 어스창() {
		JFrame f = new JFrame();
		f.setTitle("어스 상세 페이지");
		f.setSize(300, 300);
		ImageIcon icon = new ImageIcon("m5.PNG");
		JLabel m = new JLabel();
		m.setIcon(icon);
		f.add(m);
		
		f.setVisible(true);
	}
}
