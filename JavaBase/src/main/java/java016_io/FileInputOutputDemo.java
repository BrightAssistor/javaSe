package java016_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {
	public static void main(String[] args) {
		try {
			FileUtil.readFile("d:\\image1.jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class FileUtil{
	public static void readFile(String name) throws IOException{
		FileInputStream fis = new FileInputStream(name);//文件输入流
		FileOutputStream fos = new FileOutputStream("d:\\zhangsan\\aa\\qwe.mp4");//文件输出流
		
		int data = 0;
		long time1 = System.currentTimeMillis();
		while ((data = fis.read()) != -1) {
			fos.write(data);
		}
		long time2 = System.currentTimeMillis(); 
		System.out.println("共用時："+(time2 - time1));
		
		
		fis.close();
		fos.close();
		
//		byte[] buff = new byte[1024];
//		int len = 0;
//		long time1 = System.currentTimeMillis();
//		while ((len = fis.read(buff)) != -1) {
//			fos.write(buff, 0, len);
//		}
//		long time2 = System.currentTimeMillis();
//		System.out.println("共用時："+(time2 - time1));
//		fis.close();
//		fos.close();
	}
}












