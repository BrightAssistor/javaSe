package com.bristor.api;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.bristor.utils.FileUtils;

public class TcpClient {
	public static String send(String ip, int port, String fileName,String charset) {
		Socket socket = null;
		String result = null;
		try {
			socket = new Socket(ip, port);
			OutputStream out = socket.getOutputStream();
			String dataString = FileUtils.readFile(fileName, "uft-8");
			out.write(dataString.getBytes());
			InputStream in = socket.getInputStream();
			byte[] array = FileUtils.toByteArray(in);
			result = new String(array,charset);
			in.close();
			out.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
