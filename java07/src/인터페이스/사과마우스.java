package 인터페이스;

public class 사과마우스 implements Mouse {

	@Override
	public void 볼록튀어나오다() {
		System.out.println("타원형으로 볼록 튀어나오다.");
		System.out.println("사과로고를 앞부분에 크게 넣다.");
	}

	@Override
	public void 양쪽버튼을클릭하다() {
		System.out.println("왼쪽 버튼 클릭하면 선택");
		System.out.println("오른쪽 버튼 클릭하면 메뉴");
	}

}
