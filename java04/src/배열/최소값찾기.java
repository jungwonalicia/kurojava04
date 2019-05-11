package 배열;

public class 최소값찾기 {

	public static void main(String[] args) {
		int[] num = {44, 77, 22, 11, 99};
		//min변수에는 각 배열을 비교했을 때,
		//현재까지의 최소값이 들어가도록 한다.
		//처음에는 비교값이 없으므로, 
		//초기값을 배열의 첫번째 위치값을 넣어준다.
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("최소값은 " + min);
		
	}
}





