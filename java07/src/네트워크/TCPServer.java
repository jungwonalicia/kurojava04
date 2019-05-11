package 네트워크;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		//연결 요청을 받아들여 승인해주는 소켓이 따로 있다.
		ServerSocket server = new ServerSocket(9100);
		System.out.println("TCP서버가 시작되었습니다.");
		System.out.println("클라이언트로부터의 연결 요청을 기다리는 중..");
		//서버소켓이 승인을 요청하면, 양쪽에 데이터 전달용 소켓이 만들어진다.
		while(true) {
			Socket socket = server.accept();
			System.out.println("클라이언트와 연결이 되었습니다.");
		}
	}
}






