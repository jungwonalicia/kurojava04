package db프로그램;

import java.sql.*;

public class DB처리 {

	public static void main(String[] args) throws Exception {
		//1. connector설정, driver설정
		//db connector설정은 아주 많이 사용하는 기능.
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector설정 ok...");
		
		//패키지 이름은 회사인터넷 주소 거꾸로 씀.
		//com.naver.www
		
		//2. DB연결(ip+port, db명, user, password)
		String url = "jdbc:mysql://localhost:3306/me";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 ok...!!!");
		
		//3. SQL문 결정
//		URL url = new URL("http://www.naver.com");
		String sql = "insert into diary values ('20190103','phone','phone','phone')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 결정 ok....");
		
		//4. SQL문 전송하고 실행 요청
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 ok..... ");
	}
}


