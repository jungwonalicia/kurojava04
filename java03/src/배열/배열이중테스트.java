package 배열;

public class 배열이중테스트 {

	public static void main(String[] args) {
		int[][] seat = new int[3][10];
		seat[0][0] = 100;
		seat[0][9] = 200;
		seat[2][0] = 300;
		seat[2][9] = 400;
		System.out.println(seat.length);
		System.out.println(seat[0].length);
		System.out.println(seat[1].length);
		System.out.println(seat[2].length);
		
		for (int i = 0; i < 3; i++) { //배열의 행
			for (int j = 0; j < 10; j++) { //배열의 각행마다의 열
				System.out.print(seat[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
