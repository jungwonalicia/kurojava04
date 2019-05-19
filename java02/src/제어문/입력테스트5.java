package 제어문;

import java.util.Scanner;

public class 입력테스트5 {
//	지금 시각은 10
//	10시 전이면 굿모닝
//	14시 전이면 굿에프터눈
//	20시 전이면 굿이브닝
//	아니면 굿나잇
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("지금 시각은 ");
		int time = sc.nextInt();
		
		if(time <= 10) {
			System.out.println("굿모닝");
		}else if(time <= 14) {
			System.out.println("굿에프터눈");
		}else if(time <= 20) {
			System.out.println("굿이브닝");
		}else {
			System.out.println("굿나잇");
		}
	}

}





