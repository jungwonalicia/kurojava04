package 제어문;

import java.util.Scanner;

public class 입력테스트2 {

	public static void main(String[] args) {
	//입력 연습
	//입력할 수 있는 부품 사용해야 함.
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는 ");
		int age = sc.nextInt(); 
		//모든 입력의 데이터 타입은 String!!!
		//Scanner의 nextInt()는 String->int로 변환
		System.out.println("당신의 나이는 " + age + "세 시군요.");

		//이름 입력, 출력
		System.out.print("당신의 이름은 ");
		String name = sc.next(); //String입력받아서 java프로그램으로 가져다 주는 명령어.
		System.out.println("당신의 이름은 " + name + "시군요.");
		
	}

}





