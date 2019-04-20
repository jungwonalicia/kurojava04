package 배열;

import java.util.Scanner;

public class 배열활용극장예매시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[10];
		int count = 0; //예매 수 카운트할 변수
		
		while(true) {
			System.out.println("----------------------------------------");
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + "   ");
			}
			System.out.println();
			System.out.println("----------------------------------------");
			for (int i : seat) {
				System.out.print(i + "   ");
			}
			System.out.println();
			System.out.println("----------------------------------------");
			System.out.print("예매할 좌석 번호를 입력(종료 0번>>>) ");
			int data = sc.nextInt();
			if(data == 0) {
				System.out.println("예매 시스템을 종료합니다.");
				System.out.println("당신의 총 예매수는 " + count + "매");
				System.out.println("당신의 총 금액은 " + count * 10000 + "원");
				break;
			}
			//data가 1번이면,  위치값은 0번
			//seat[data-1]
			//예매 여부를 미리 한번 체크
			if(seat[data-1] != 1) {
				seat[data-1] = 1;
				System.out.println("예매 완료");
				count++;
			}else {
				System.out.println("이미 예매된 자리입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}














