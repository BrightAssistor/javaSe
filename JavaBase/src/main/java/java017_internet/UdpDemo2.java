package java017_internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//创建UDP接收端
public class UdpDemo2 {
	public static void main(String[] args) throws IOException {
		// 指定接收udpdemo1发送到的端口号8000
		DatagramSocket datagramSocket = new DatagramSocket(8000);
		// --------------------------------------------接收数据
		// 参数1：数组用来存放接收的数据，参数2：这个数组的长度
		byte[] data = new byte[100];
		DatagramPacket datagramPacket2 = new DatagramPacket(data, 100);
		datagramSocket.receive(datagramPacket2);

		System.out.println(new String(data, 0, datagramPacket2.getLength()));

		// --------------------------------------------发送数据
		// ---把要发送的数据封装到数据包中
		String content = "your man";
		// 参数1：content转换为字节数组，参数2：content的长度,参数3：发送到的ip地址，参数4：发送到的IP地址下的某个端口号
		DatagramPacket datagramPacket = new DatagramPacket(content.getBytes(),
				content.length(), datagramPacket2.getAddress(),
				datagramPacket2.getPort());
		// 发送数据包
		datagramSocket.send(datagramPacket);
		// 释放资源
		datagramSocket.close();
	}
}
