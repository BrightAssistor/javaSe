package java016_io;

import java.io.File;

public class RecursionFile2 {

	public static void main(String[] args) {
		String pathString = System.getProperty("user.dir")+"//src//main//java//1";
		File file = new File(pathString);
		if (file.exists()) {
			getSubFiles(file);
		}
	}
	public static void getSubFiles(File file) {
		if (file.isDirectory()) {
			System.out.println(file.getName()+":");
			File[] listFiles = file.listFiles();
			for (int i = 0; i < listFiles.length; i++) {
				getSubFiles(listFiles[i]);
			}
		}else {
			System.out.println(file.getName());
		}
	}
}
