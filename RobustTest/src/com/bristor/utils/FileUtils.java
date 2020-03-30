package com.bristor.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileUtils {
	public static String readFile(String fileName,String charset) {
		String filePath = CommonConfigs.FILEPATH + fileName;
		File file = new File(filePath);
		String result = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			byte[] data = toByteArray(fis);
			result = new String(data,charset);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public static byte[] toByteArray(InputStream in) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buffer =new byte [1024 * 4];
		int n;
		while ((n = in.read(buffer)) != -1){
			out.write(buffer, 0, n);
		}
		return out.toByteArray();
	}


}
