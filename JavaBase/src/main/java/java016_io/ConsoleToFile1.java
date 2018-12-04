package java016_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;

public class ConsoleToFile1 {
	public static void main(String[] args) {
		InputStream in = null;
		FileOutputStream outFile = null;
		try {
			in = System.in;
			outFile = new FileOutputStream(new File("D:\\log.txt"));
			byte[] bytes=new byte[1024];
			int len = 0;
			while (true) {
				len=in.read(bytes);
				outFile.write(bytes,0,len);
				
				if ("exit".equals(new String(bytes, 0, len-2))) {
					break;
				}
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally{
			try {
				in.close();
				outFile.flush();
				outFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
}}
