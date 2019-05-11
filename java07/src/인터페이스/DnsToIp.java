package 인터페이스;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DnsToIp {

	public static void main(String[] args) throws UnknownHostException {
		String dns = "www.daum.net";
		InetAddress ip = InetAddress.getByName(dns);
		System.out.println(ip.getHostAddress());
	}
}




