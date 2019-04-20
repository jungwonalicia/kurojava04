package 배열;

public class 배열테스트3 {

	public static void main(String[] args) {
//		친구들의 시력 3명 넣고, 전체 출력
		double[] eye = {1.5, 2.0, 1.2};
		System.out.println("친구들의 시력 결과");
		for (double d : eye) {
			System.out.println(d);
		}
		System.out.println();
//		친구들의 키 3명 넣고, 전체 출력
		int[] height = {150, 180, 160};
		System.out.println("친구들의 키 결과");
		for (int i : height) {
			System.out.println(i);
		}
		System.out.println();
		
//		친구들의 성별 3명 넣고, 전체 출력
		char[] gender = {'남','여','남'};
		System.out.println("친구들의  성별 결과");
		for (char c : gender) {
			System.out.println(c);
		}
		System.out.println();
		
//		친구들의 최종학점 넣고, 전체 출력
		char[] level = {'A', 'B', 'C'};
		System.out.println("친구들의 최종학점 결과");
		for (char c : level) {
			System.out.println(c);
		}

	}

}
