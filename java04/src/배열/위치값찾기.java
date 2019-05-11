package 배열;

public class 위치값찾기 {

	public static void main(String[] args) {
		int[] num = {33, 55, 66, 88, 99, 22, 11};
		int find = 88;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == find) {
				System.out.println(i + "번째 인덱스에 위치합니다.");
			}
		}
	}

}
