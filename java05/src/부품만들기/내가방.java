package 부품만들기;

public class 내가방 {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.name = "애플폰";
		p1.size = 11;
		
		//메소드는 사용하지 않으면
		//실행되지 않음.
		//사용하는 것을 부른다(콜, call)
		//메소드를 콜해서 사용=> 실행!
		//콜할 때, 반환값을 받지 않는 경우 void
		p1.tel();
		System.out.println(p1.find());
		String site = p1.find();
		System.out.println("당신의 주요 검색 사이트는 " + site);
//		2. 메소드를 사용한다.
//		리턴받은 10을 time 변수에 넣는다.
//		프린트에 time변수 사용: 나는 게임을 10시간 합니다.
		int time = p1.game();
		System.out.println("나는 게임을 " + time + "시간 합니다.");
		String friend = p1.kakaotalk();
		System.out.println("친구 " + friend + "과 매일 카톡해요.");
	}
}





