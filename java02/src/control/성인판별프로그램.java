package control;

import java.util.Scanner;

public class 성인판별프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 해를 입력: ");
		int year = sc.nextInt();
		
		int age = 2019 - year + 1;
		System.out.println("당신의 나이는 " + age);
		
		if (age >= 20) {
			//조건이 맞으면 처리되는 내용.
			System.out.println("성인입니다.");
		} else {
			//조건이 맞지 않으면 처리되는 내용.
			System.out.println("미성인입니다.");
		}
		
	}

}
