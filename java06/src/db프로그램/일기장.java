package db프로그램;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 일기장 extends JFrame {
	private JTextField day1;
	private JTextField title1;
	private JTextField content1;
	private JTextField etc1;

	public 일기장() {
		getContentPane().setBackground(new Color(124, 252, 0));
		setTitle("나의 일기장");
		setSize(448, 830);
		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);
		JLabel top = new JLabel();
		ImageIcon icon = new ImageIcon("017.png");
		top.setIcon(icon);
		getContentPane().add(top);

		JLabel lblNewLabel = new JLabel("날짜");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 40));
		getContentPane().add(lblNewLabel);

		day1 = new JTextField();
		day1.setForeground(Color.BLUE);
		day1.setBackground(Color.YELLOW);
		day1.setFont(new Font("Dialog", Font.BOLD, 40));
		getContentPane().add(day1);
		day1.setColumns(10);

		JLabel label = new JLabel("제목");
		label.setFont(new Font("Dialog", Font.BOLD, 40));
		getContentPane().add(label);

		title1 = new JTextField();
		title1.setForeground(Color.BLUE);
		title1.setFont(new Font("Dialog", Font.BOLD, 40));
		title1.setColumns(10);
		title1.setBackground(Color.YELLOW);
		getContentPane().add(title1);

		JLabel label_1 = new JLabel("제목");
		label_1.setFont(new Font("Dialog", Font.BOLD, 40));
		getContentPane().add(label_1);

		content1 = new JTextField();
		content1.setForeground(Color.BLUE);
		content1.setFont(new Font("Dialog", Font.BOLD, 40));
		content1.setColumns(10);
		content1.setBackground(Color.YELLOW);
		getContentPane().add(content1);

		JLabel label_2 = new JLabel("기타");
		label_2.setFont(new Font("Dialog", Font.BOLD, 40));
		getContentPane().add(label_2);

		etc1 = new JTextField();
		etc1.setForeground(Color.BLUE);
		etc1.setFont(new Font("Dialog", Font.BOLD, 40));
		etc1.setColumns(10);
		etc1.setBackground(Color.YELLOW);
		getContentPane().add(etc1);

		JButton btnNewButton = new JButton("일기DB에 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. connector설정, driver설정
				// db connector설정은 아주 많이 사용하는 기능.
				try {
					Class.forName("com.mysql.jdbc.Driver");

					System.out.println("1. connector설정 ok...");

					// 패키지 이름은 회사인터넷 주소 거꾸로 씀.
					// com.naver.www

					// 2. DB연결(ip+port, db명, user, password)
					String url = "jdbc:mysql://localhost:3306/me";
					String user = "root";
					String password = "1234";

					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("2. DB연결 ok...!!!");

					// 3. SQL문 결정
//				URL url = new URL("http://www.naver.com");
					String day = day1.getText();
					String title = title1.getText();
					String content = content1.getText();
					String etc = etc1.getText();
					
					String sql = "insert into diary values (?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, day);
					ps.setString(2, title);
					ps.setString(3, content);
					ps.setString(4, etc);
					System.out.println("3. SQL문 결정 ok....");

					// 4. SQL문 전송하고 실행 요청
					ps.executeUpdate();
					System.out.println("4. SQL문 전송 ok..... ");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 40));
		getContentPane().add(btnNewButton);

		setVisible(true);
	}

	public static void main(String[] args) {
		일기장 name = new 일기장();
	}
}
