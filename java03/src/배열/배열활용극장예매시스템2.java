package 배열;

import java.util.Scanner;

public class 배열활용극장예매시스템2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] seat = new int[3][10];
		int count = 0; // 예매 수 카운트할 변수

		while (true) {
			System.out.println("----------------------------------------");
			for (int j = 0; j < 10; j++) {
				System.out.print(j + "   ");
			}
			System.out.println();
			System.out.println("----------------------------------------");

			for (int i = 0; i < 3; i++) { // 배열의 행
				for (int j = 0; j < 10; j++) { // 배열의 각행마다의 열
					System.out.print(seat[i][j] + "   ");
				}
				System.out.println();
			}

			System.out.println("----------------------------------------");
			System.out.print("예매 1, 종료 0>> ");
			int exit = sc.nextInt();
			if (exit == 0) {
				System.out.println("예매 시스템을 종료합니다.");
				System.out.println("당신의 총 예매수는 " + count + "매");
				System.out.println("당신의 총 금액은 " + count * 10000 + "원");
				break;
			}

			System.out.print("예매할 좌석 행번호: >>> ");
			int data = sc.nextInt();
			System.out.print("예매할 좌석 열번호: >>> ");
			int data2 = sc.nextInt();

			if (seat[data][data2] != 1) {
				seat[data][data2] = 1;
				System.out.println("예매 완료");
				count++;
			} else {
				System.out.println("이미 예매된 자리입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
