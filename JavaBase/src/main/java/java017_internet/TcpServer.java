package java017_internet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//基于TCP协议的服务端
public class TcpServer {
	public static void main(String[] args) throws IOException {
		//一：创建一个ServerSocket对象,可以指定端口号
		ServerSocket serverSocket = new ServerSocket(8888);
		//二：調用accept()方法等待客户端连接，成功则会返回一个socket，否则阻塞
		Socket socket = serverSocket.accept();
		//三：通過socket與客戶端交互
		System.out.println(socket.getInetAddress().getHostAddress()+"已連接！");//提示哪个客户端已连接
		//读取客户端发送的消息
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println(br.readLine());
		System.out.println(socket.getInetAddress().getHostAddress()+"已关闭！");//提示哪个客户端已连接
		//四：关闭资源：IO和Socket
		br.close();
		socket.close();
		serverSocket.close();
	}
}
