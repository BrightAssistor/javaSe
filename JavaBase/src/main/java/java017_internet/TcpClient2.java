package java017_internet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//一：創建socket对象，指定服务器端的IP地址和端口号，与服务器端连接
		Socket socket = new Socket("192.168.0.104", 9000);
		//二：通過socket與服务器端交互
		BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in));//System.in:键盘的标准输入
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String temp = null;
		while ((temp = brKey.readLine()) != null) {
			bw.write(temp);
			bw.newLine();//创建换行符
			bw.flush();//强制清空缓存，输出内容
			if (temp.equalsIgnoreCase("over")) {
				break;
			}
			System.out.println(br.readLine());//读取服务端信
		}
		
		//三：关闭资源IO和Socket
		brKey.close();
		bw.close();
		br.close();
		socket.close();
	}
}
