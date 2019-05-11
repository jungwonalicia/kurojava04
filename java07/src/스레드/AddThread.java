package 스레드;

public class AddThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("증가: " + i);
		}
	}
}
