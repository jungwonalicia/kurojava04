package 배열;

import java.util.Scanner;

public class 인기투표배열문제 {

	public static void main(String[] args) {
//		1) 인기투표하고 싶은 가수명 입력
//	        1) 아이유, 2) 블랙핑크, 3) 김연우
		String[] singer = new String[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < singer.length; i++) {
			System.out.print("가수 이름 입력>> ");
			singer[i] = sc.next();
		}
		System.out.println(singer[0] + ", " + singer[1] + ", " + singer[2]);

		int[] 투표용배열 = new int[3];
//		2) 인기투표를 합니다.
//	  		 아이유, 블랙핑크, 아이유, 블랙핑크,
//	   		아이유, 김연우
		for (int i = 0; i < 6; i++) {
			System.out.println("1) " + singer[0] + ", " + "2) " + singer[1] + ", " + "3) " + singer[2]);
			System.out.print("투표 번호>> ");
			int 투표 = sc.nextInt();
			if (투표 == 1) { // 아이유- 인덱스(0)
				투표용배열[0] = 투표용배열[0] + 1;
			} else if (투표 == 2) { // 블랙핑크- 인덱스(1)
				투표용배열[1] = 투표용배열[1] + 1;
			} else if (투표 == 3) { // 김연우- 인데그(2)
				투표용배열[2] = 투표용배열[2] + 1;
			} else {
				System.out.println("해당 번호가 존재하지 않습니다.");
				System.out.println("다시 입력해주세요..");
			} //else
		}//투표 for
		for (int i = 0; i < 3; i++) {
			System.out.println(singer[i] + ": " + 투표용배열[i]);
		}
	}//main
}//class



