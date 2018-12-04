package java017_internet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//一：創建socket对象，指定服务器端的IP地址和端口号，与服务器端连接
		Socket socket = new Socket("192.168.0.104", 8888);
		//二：通過socket與服务器端交互
		BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in));//System.in:键盘的标准输入
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		bw.write(brKey.readLine());
		//三：关闭资源IO和Socket
		brKey.close();
		bw.close();
		socket.close();
	}
}
