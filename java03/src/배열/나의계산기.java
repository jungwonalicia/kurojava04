package 배열;

import java.util.Scanner;

public class 나의계산기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1입력>> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2입력>> ");
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 합은 " + (num1 + num2));
	}

}







