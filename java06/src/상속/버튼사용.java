package 상속;

public class 버튼사용 {

	public static void main(String[] args) {
		버튼 b1 = new 버튼();
		b1.shape = "네모";
		b1.click();
		
		버튼 b2 = new 버튼("세모");
		b2.click();
		
	}

}
