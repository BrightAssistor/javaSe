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

public class Demo {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("d:\\bb.txt"),true),"utf-8"));
		bw.write("饭都快来给你开了方便方便分类别发了不发了不麻烦了不放大了比例分别麻烦老大帮忙帮忙了方便面了发布了发布了发布非");
		bw.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("d:\\bb.txt")),"utf-8"));
		
		String content = null;
		while ((content = br.readLine()) != null) {
			System.out.println(content);
		}
		br.close();
	}
}
