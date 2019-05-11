package 상속;

public class 버튼 {
//	버튼 -> 클래스
//	- 정적특징:네모(멤버변수)
	String shape;
//	- 동적특징:클릭하다(멤버메소드)
	
	//매개변수 없는 생성자(기본 생성자)
	public 버튼() {
	}
	
	//매개변수 있는 생성자 
	public 버튼(String shape) {
		this.shape = shape;
	}
	
	public void click() {
		System.out.println("클릭하다.");
	}
}
