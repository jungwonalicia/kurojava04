package 상속;

public class 자동차사용 {

	public static void main(String[] args) {
		세단 s = new 세단();
		트럭 t = new 트럭();
		s.color = "빨강";
		s.name = "세련세단";
		t.color = "파랑";
		t.name  = "누비다트럭";
		
		s.start();
		s.stop();
		s.window();
		
		System.out.println();
		t.start();
		t.stop();
		t.move();
	}

}






