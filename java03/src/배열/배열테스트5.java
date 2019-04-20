package 배열;

public class 배열테스트5 {

	public static void main(String[] args) {
		int[] 숫자 = new int[100];
		System.out.println(숫자.length + "개");
		
		//forEach: 배열은 0부터 무조건 시작하고 개수-1에서 끝남.
		for (int i : 숫자) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		숫자[0] = 100;
		숫자[55] = 500;
		숫자[99] = 900;

		for (int i = 0; i < 숫자.length; i++) {
			if (i == 55) {
				숫자[i] = 555;
			}
			if (i == 99) {
				숫자[i] = 999;
			}
		}
		System.out.println();
		for (int i = 0; i < 숫자.length; i++) {
			System.out.print(숫자[i] + " ");
		}
		
	}
}
