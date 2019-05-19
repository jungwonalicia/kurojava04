package 제어문;

import java.util.Scanner;

public class 입력테스트11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------");
		System.out.print("숫자1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 입력: ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력: ");
		String oper = sc.next(); //"+"
		char op = oper.charAt(0); //'+'
		
		switch(op) {
		case '+': 
			System.out.println(num1 + num2);
			break;
		case '-': 
			System.out.println(num1 - num2);
			break;
		case '*': 
			System.out.println(num1 * num2);
			break;
		case '/': 
			System.out.println(num1 / num2);
			break;
		}
	}
}





