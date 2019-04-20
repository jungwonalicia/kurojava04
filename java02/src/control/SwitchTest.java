package control;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("저기요!!!!");
		System.out.println("----------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("----------");
		System.out.println("1) 짜장면, 2) 짬뽕, 3) 우동");
		System.out.println("----------");
		System.out.print("당신의 선택은? ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("짜장면 선택함.");
			break;
		case 2:
			System.out.println("짬뽕 선택함.");
			break;
		case 3:
			System.out.println("우동 선택함.");
			break;
		default:
			System.out.println("메뉴에 없음.");
		}
		
		
	}
}






