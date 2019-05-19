package 제어문;

import java.util.Scanner;

public class 제어문정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력: ");
		String name = sc.next();
		System.out.print("학생의 점수를 입력: ");
		int jumsu = sc.nextInt();
		System.out.print(name + "학생의 점수는 ");
		
		if(jumsu >= 90) {
			System.out.println("A학점 입니다.");
		}else if(jumsu >= 80) {
			System.out.println("B학점 입니다.");
		}else if(jumsu >= 70) {
			System.out.println("C학점 입니다.");
		}else if(jumsu >= 60) {
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
		}
		
	}
}



