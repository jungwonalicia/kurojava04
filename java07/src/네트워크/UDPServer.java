package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) throws Exception {
		//서버 --데이터-->클라이언트
		DatagramSocket socket = new DatagramSocket();
		String data = "java programmer...";
		byte[] data2 = data.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet 
		 = new DatagramPacket(data2, data2.length, ip, 5000);
		
		socket.send(packet);
		System.out.println("클라이언트에게 데이터 전달 완료...!!");
	}
}






