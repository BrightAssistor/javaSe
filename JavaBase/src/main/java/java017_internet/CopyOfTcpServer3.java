package java017_internet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CopyOfTcpServer3 {
	public static void main(String[] args) throws IOException {
		// 一：创建一个ServerSocket对象,可以指定端口号
		ServerSocket serverSocket = new ServerSocket(9000);

		// 二：調用accept()方法等待客户端连接，成功则会返回一个socket，否则阻塞
		Socket socket = serverSocket.accept();
		// 三：通過socket與客戶端交互
		System.out.println(socket.getInetAddress().getHostAddress() + "已連接！");// 提示哪个客户端已连接
		// 读取客户端发送的消息
		BufferedReader br = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		// 向客户端发送的消息
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				socket.getOutputStream()));
		
		String temp = null;
		while ((temp = br.readLine()) != null) {
			System.out.println(temp);
			if (temp.equals("1,1")) {// 如果客户端发送来的是over，则代表客户端退出程序
				BufferedReader brKey = new BufferedReader(new InputStreamReader(new ByteArrayInputStream("ok".getBytes())));// System.in:键盘的标准输入
				String a = null;
				while ((a = brKey.readLine()) != null) {
					bw.write(a);// 转换为大写
					bw.newLine();//创建换行符
					System.out.println(a);
					bw.flush();// 强制清空缓存，输出内容
					break;
				}
			}
			
			BufferedReader brKey1 = new BufferedReader(new InputStreamReader(
					System.in));// System.in:键盘的标准输入
			String b = null;
			while ((b = brKey1.readLine()) != null) {
				bw.write(b);// 转换为大写
				bw.newLine();//创建换行符
				System.out.println(b);
				bw.flush();// 强制清空缓存，输出内容
				if (b.equals("exit")) {
					break;
				}
			}
		}

		System.out.println(socket.getInetAddress().getHostAddress() + "已关闭！");// 提示哪个客户端已连接
		// 四：关闭资源：IO和Socket
		br.close();
		bw.close();
		socket.close();
		serverSocket.close();
	}
}
