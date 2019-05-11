package 배열;

import java.util.Scanner;

public class 은행예금배열 {

	public static void main(String[] args) {
		//1. 예금주와 예금을 저장할 공간이 필요.
		String[] names = new String[3];
		int[] money = new int[3];
		
		//2. 입력용 부품(class)가 필요.
		Scanner sc = new Scanner(System.in);
		
		//3. 입력해서 저장공간에 저장.
		for (int i = 0; i < money.length; i++) {
			System.out.print("예금주 이름>> ");
			names[i] = sc.next();
			System.out.print("예금액 입력>> ");
			money[i] = sc.nextInt();
		}
		System.out.println("---------------");
		//4. 저장해놓은 공간에서 꺼내어 출력.
		for (int i = 0; i < money.length; i++) {
			System.out.println(names[i] 
					+ " 님의 예금액은 " + money[i]);
		}
	}
}




