package control;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 스캐너테스트 {

	public static void main(String[] args) {
//		String data = JOptionPane.showInputDialog("나이를 입력 ");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int data1 = sc.nextInt();
		
		System.out.print("실수 입력: ");
		double data2 = sc.nextDouble();
		
		//스트링.=> 기본값.
		System.out.print("스트링 입력: ");
		String data3 = sc.next();
		
		System.out.print("부울렌 입력: ");
		boolean data4 = sc.nextBoolean();
		
	}

}




