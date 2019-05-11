package 배열;

import java.util.Scanner;

public class 입력값배열에넣기 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, n3 = 0;
		int[] n4 = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			n4[i]= sc.nextInt();
		}
		
		for (int i : n4) {
			System.out.println(i);
		}
	}

}
