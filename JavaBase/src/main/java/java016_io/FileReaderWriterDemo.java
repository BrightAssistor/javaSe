package java016_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) throws IOException {
//		FileInputStream fis= null;
//		FileOutputStream fos = null;
//		
//		try {
//			fis = new FileInputStream("d:\\zhangsan\\aa.txt");
//			fos = new FileOutputStream("d:\\zhangsan\\bb.txt");
//			
//			int data = 0;
//			while ((data = fis.read()) != -1 ) {
//				fos.write(data);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//			try {
//				fis.close();
//				fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		//文件字符输入流
		FileReader fr = new FileReader("d:\\zhangsan\\aa.txt");
		//文件字符输出流
		FileWriter fw = new FileWriter("d:\\zhangsan\\cc.txt");
		BufferedReader br = new BufferedReader(fr, 1400);
		BufferedWriter bw = new BufferedWriter(fw, 1400);
		
//		char[] data = new char[1024];
		String len = null;
		while ((len = br.readLine()) != null) {
			bw.write(len);
			bw.newLine();
//			bw.flush();
		}
		
//		br.close();
//		bw.close();
	}
}







