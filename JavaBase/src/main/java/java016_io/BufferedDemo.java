package java016_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {
	public static void main(String[] args) {
		try {
			FileCopy.copyFile("d:\\zhangsan\\aa\\qwe.mp4");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class FileCopy{
	public static void copyFile(String name) throws IOException{
		FileInputStream fis = new FileInputStream(name);
		FileOutputStream fos = new FileOutputStream("d:\\biubiu.mp4");
		BufferedInputStream bis = new BufferedInputStream(fis, 23232);
		BufferedOutputStream bos = new BufferedOutputStream(fos, 23232);
		
		int data = 0;
		long time1 = System.currentTimeMillis();
		while ((data = bis.read()) != -1) {
			bos.write(data);
		}
		long time2 = System.currentTimeMillis();
		System.out.println("sdfdd:"+(time2 - time1));
		
//		fis.close();
//		fos.close();
		bis.close();
		bos.close();
		
	}
}




