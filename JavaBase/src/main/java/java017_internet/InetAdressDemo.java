package java017_internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getByName("192.168.136.1");
		System.out.println(address.getHostAddress());
		System.out.println(InetAddress.getLocalHost());
		System.out.println(address.getLocalHost());
		
	}
}
