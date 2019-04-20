package control;

import java.util.Scanner;

public class 덧셈만계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력: ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력: ");
		String oper = sc.next(); 
		//연산자의 타입=>스트링(기본 데이터 타입X)
		//기본 데이터 타입이 아니기 때문에 비교연산자 사용 불가.
		char oper2 = oper.charAt(0);
		if (oper2 == '+') {
			System.out.println("두 수의 합은 " + (num1 + num2));
		}else {
			System.out.println(oper + "연산은 할 수 없어요.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
