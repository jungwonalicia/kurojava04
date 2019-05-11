package 상속;

public class 은행사용 {
	public static void main(String[] args) {
		BadBank bad = new BadBank();
		GoodBank good = new GoodBank();
		NormalBank normal = new NormalBank();
		System.out.println("보통 은행의 대출 이자율은: " + normal.대출이자를받다());
		System.out.println("좋은 은행의 대출 이자율은: " + good.대출이자를받다());
		System.out.println("나쁜 은행의 대출 이자율은: " + bad.대출이자를받다());
	}
}
