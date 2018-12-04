package java016_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
//		// 文件字符输入流
//		FileReader fr = new FileReader("d:\\zhangsan\\aa.txt");
//		// 文件字符输出流
//		FileWriter fw = new FileWriter("d:\\zhangsan\\cc.txt");
//		BufferedReader br = new BufferedReader(fr, 6073);
//		BufferedWriter bw = new BufferedWriter(fw, 6073);
//
//		String len = null;
//		while ((len = br.readLine()) != null) {
//			bw.write(len);
//			bw.newLine();
//			// bw.flush();
//		}
//
//		// br.close();
//		// bw.close();
//		File cc = new File("d:\\javase\\aa\\cc\\qq.txt");
//		System.out.println("创建任意文件:"+cc.createNewFile());//bao
		File file = new File("d:\\javase");//如果不存在，下面判断为false
		String[] list = file.list();
		for (String string : list) {
			
			System.out.println(string);
		}
		System.out.println("*********************************");

		File[] files = file.listFiles();//该文件夹中所有文件夹和文件
		for (File file4 : files) {
			System.out.println(file4.getAbsolutePath());
		}
	}
}
