package data;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		//1. 날짜
		Date date = new Date();
		System.out.println(date.getHours());
		//2. 랜덤값
		Random r = new Random();
		System.out.println(r.nextInt(10));
		//3. 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터 입력하세요..");
		String data = sc.next();
		System.out.println("당신이 입력한 값은 " + data);
	}
}



