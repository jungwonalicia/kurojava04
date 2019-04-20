package control;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실적 입력: ");
		int target = 1000;
		int money = sc.nextInt();
		int over = money - target; //초과금액
		double bonus = over * 0.1;
		int bonus2 = (int)bonus; 
		//강제 타입변환 (바꾸고 싶은 타입 키워드)데이터 
		//casting(캐스팅)
		
		if(money >= target) {
			System.out.println("실적 달성.");
			System.out.println("보너스는 " + bonus2);
		}else {
			System.out.println("실적 미달성.");
		}
		
		
		
		
		
	}
}






