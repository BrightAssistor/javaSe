package java016_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
	public static void main(String[] args) {
		try {
			CopyDirUtil.copyDir(new File("d:\\zhangsan"), new File("c:\\copy"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class CopyDirUtil{
	//src：要复制的文件夹--- dst:复制到的目标文件夹
	public static void copyDir(File src,File dst) throws IOException{
		dst.mkdirs();//创建目标文件夹
		if (src != null) {
			File[] files = src.listFiles();//得到src中所有的文件夾和文件
			if (files != null) {
				for (File file : files) {
					if (file.isFile()) {//如果是文件
						FileInputStream fis = new FileInputStream(file);
						FileOutputStream fos = new FileOutputStream(dst.getAbsoluteFile()+"\\"+file.getName());
						BufferedInputStream bis = new BufferedInputStream(fis);
 						BufferedOutputStream bos = new BufferedOutputStream(fos);
						int len = 0;
 						while ((len = bis.read()) != -1) {
							bos.write(len);
						}
 						//关闭流
 						bis.close();
 						bos.close();
					} else {
						//递归调用
						copyDir(file, new File(dst.getAbsoluteFile()+"\\"+file.getName()));
					}
				}
			}
		}
	}
}
