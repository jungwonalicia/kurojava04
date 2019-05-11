package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(5000);
		System.out.println("서버로 부터 데이터 수신 준비 완료..!!!!");
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		socket.receive(packet);
		System.out.println("서버로 부터 받은 데이터는 " + new String(data));
		System.out.println("서버로 부터 데이터 수신 완료..!!!");
	}
}




