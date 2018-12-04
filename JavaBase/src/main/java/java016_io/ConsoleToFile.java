package java016_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;

public class ConsoleToFile {
	public static void main(String[] args) {
		try {
			InputStream in = System.in;
			FileOutputStream outFile = new FileOutputStream(new File("D:\\log.txt"));
			int read = 0;
			while ((read=in.read()) != -1) {
				outFile.write(read);
				
			}
			outFile.flush();
			outFile.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	    OutputStream output = System.out;           //实例化OutputStream对象

	    byte[] bytes = "使用OutputStream输出流在控制台输出字符串\n".getBytes();       //创建bytes数组

	    try {
	        output.write(bytes);

	        bytes = "输出内容：\n".getBytes();
	        output.write(bytes);        //向流中写入数据

	        bytes = "Java数据交互管道——IO流 \n".getBytes();
	        output.write(bytes);

	        output.close();

	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    }
}
