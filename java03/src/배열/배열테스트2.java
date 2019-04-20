package 배열;

public class 배열테스트2 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "김길동", "박길동"};
		names[2] = "박기대";
		
		System.out.println(names.length + "개의 배열 생성");
		for (String s : names) {
			System.out.println(s);
		}
	}
}
