package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------");
		System.out.print("����1 �Է�: ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է�: ");
		int num2 = sc.nextInt();
		System.out.print("������ �Է�: ");
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





