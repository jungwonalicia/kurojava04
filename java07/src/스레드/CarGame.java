package 스레드;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	public class CarThread extends Thread {
		int x, y;
		ImageIcon icon;
		JLabel label;
		public CarThread(String name, int x, int y) {
			System.out.println(name + "자동차 스레드 생성");
			this.x = x;
			this.y = y;
			icon = new ImageIcon(name);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100, 100);
			add(label);
		}
		
		@Override
		public void run() {
			Random random = new Random();
			for (int i = 0; i < 100; i++) {
				x = x + random.nextInt(10);
				label.setBounds(x, y, 100, 100);
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
				}
			}
	}
	}
	public CarGame() {
		setTitle("나의 자동차 경주 게임");
		setSize(600,200);
		
		CarThread car1 = new CarThread("car1.gif", 50, 50);
		CarThread car2 = new CarThread("car2.gif", 50, 100);
		CarThread car3 = new CarThread("car3.gif", 50, 150);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		CarGame game = new CarGame();
	}

}
