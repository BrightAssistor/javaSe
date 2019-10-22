package java016_io;

import java.io.File;

public class RecursionFile {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir")+File.separator+"src\\main\\java";
		System.out.println(path);
		File file = new File(path);
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
