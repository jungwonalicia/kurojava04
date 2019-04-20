package 배열;

public class 배열테스트4 {

	public static void main(String[] args) {
		int[] 점수 = new int[5];
		System.out.println(점수[0]);
		
//		변수하나는 자동 초기화 시켜주지 않음.
//		프로그래머가 변수를 초기화 시켜주어야 함.
//		int 점수2 = 0;
//		System.out.println(점수2);
		
		점수[4] = 100;
		점수[0] = 900;
		
		for (int i : 점수) {
			System.out.println(i);
		}
	}
}
