package java016_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//流转换
public class StreamConvertingDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(new File("d:\\student.txt"));
		InputStreamReader isr = new InputStreamReader(fis);//字节流转换为字符流
		BufferedReader br = new BufferedReader(isr);
		//添加缓存
		FileOutputStream fos = new FileOutputStream(new File("d:\\qwerdf.txt"));
		OutputStreamWriter osw = new OutputStreamWriter(fos);//字符流转换为字节流
		BufferedWriter bw = new BufferedWriter(osw);
		
		String  data =null ;
		while ((data=br.readLine())!=null) {
			bw.write(data);
		}
		br.close();
		bw.close();
	}
}
