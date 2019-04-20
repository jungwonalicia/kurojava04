package 배열;

import java.util.Scanner;

public class 반복문테스트2 {
	public static void main(String[] args) {
//		for(시작값; 조건식; 증감값) 
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);
		int data = 0; //타입 변수명(선언, 메모리가 할당)
		for (int i = 0; i < 5; i++) {
			System.out.print("점수를 입력하세요.>>> ");
			num[i] = sc.nextInt();
		}
		
		System.out.println(num);
		
		for (int i : num) {
			System.out.println(i);
		}
	}
}








