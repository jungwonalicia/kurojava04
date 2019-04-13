package data;

public class DataUse {

	public static void main(String[] args) {
		byte age = 100; //-128~127
		short showSize = 250;
		int money = 20000000;
		long space = 3333333333L;
		float eye = 1.8f;
		double pi = 3.17214213451544;
		char gender = '남';
		boolean lunch = true; //false(거짓)
		String name = "홍길동";
		
		System.out.println("나의 나이는 " + age + "세");
		System.out.println("나의 신발사이즈는 " + showSize + "mm");
		System.out.println("내 시력은 " + eye);
		System.out.println("나의 이름은 " + name);
	}

}
