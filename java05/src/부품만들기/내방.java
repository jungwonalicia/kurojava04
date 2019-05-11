package 부품만들기;

public class 내방 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.shape = "네모";
		tv1.size = 100;
		
		tv1.powerOn();
		tv1.changeCh();
		tv1.powerOff();
		
		System.out.println(tv1.shape);
		System.out.println(tv1.size);
		System.out.println("------------");
		
		선풍기 sun = new 선풍기();
		sun.color = "검정색";
		sun.size = 80;
		
		sun.stop();
		sun.strong();
		System.out.println(sun.color);
		System.out.println(sun.size);
		
		Tv tv2 = new Tv();
		tv2.shape = "동그란 모양";
		tv2.size = 40;
		
		tv2.powerOn();
		tv2.powerOff();
		System.out.println("-------");
		
		Tv tv3 = new Tv();
		tv3.shape = "삼각형";
		tv3.size = 50;
		
		System.out.println(tv3);
		//기본형이 아니면, 변수에는 주소값이 들어있다.
		//주소값.
		
		
		
		
		
		
		
		
		
		
	}

}
