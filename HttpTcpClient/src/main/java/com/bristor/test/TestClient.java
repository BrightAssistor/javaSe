package com.bristor.test;

import com.bristor.api.HttpClient;
import com.bristor.api.TcpClient;

public class TestClient {

	public static void main(String[] args) {
		String result = HttpClient.sendPostData("http://127.0.0.1:8080/HttpServer/sendPostData","sendData.xml");
		System.out.println("返回http结果："+result);
		String send = TcpClient.send("127.0.0.1", 7900, "sendData.xml", "uft-8");
		System.out.println("返回tcp结果："+send);
	}

}
