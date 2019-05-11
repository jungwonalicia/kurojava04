package 스레드;

public class 증가감소실행스레드 {

	public static void main(String[] args) {
		AddThread add = new AddThread();
		MinusThread minus = new MinusThread();
		add.start();
		minus.start();
	}

}
