package java017_internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import com.sun.org.apache.bcel.internal.generic.NEW;
//创建UDP发送端
public class UdpDemo1 {
	public static void main(String[] args) throws IOException {
		// 随机分配端口号，也可以指定
		DatagramSocket datagramSocket = new DatagramSocket();
		// --------------------------------------------发送数据
		// ---把要发送的数据封装到数据包中
		String content = "see you again";
		// 参数1：content转换为字节数组，参数2：content的长度,参数3：发送到的ip地址，参数4：发送到的IP地址下的某个端口号
		DatagramPacket datagramPacket = new DatagramPacket(content.getBytes(),
				content.length(), InetAddress.getByName("127.0.0.1"), 8000);
		// 发送数据包
		datagramSocket.send(datagramPacket);

		// --------------------------------------------接收数据
		// 参数1：数组用来存放接收的数据，参数2：这个数组的长度
		byte[] data = new byte[100];
		DatagramPacket datagramPacket2 = new DatagramPacket(data, 100);
		datagramSocket.receive(datagramPacket2);

		System.out.println(new String(data, 0, datagramPacket2.getLength()));
		// 释放资源
		datagramSocket.close();
	}
}
