package 배열;

import java.util.Scanner;

public class 입력받아평균문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		//1. 입력을 받아서 배열에 넣는다.
		for (int i = 0; i < num.length; i++) {
			System.out.print("점수입력: ");
			num[i] = sc.nextInt();
			sum = sum + num[i];
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("점수의 평균: " + sum/num.length);
		
	}

}
