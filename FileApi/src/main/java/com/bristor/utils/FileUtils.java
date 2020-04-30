package com.bristor.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
	/**
	 * 根据任意文件路径，遍历所有的目录及文件的名称
	 * @param file
	 * @return
	 */
	public static List<String> loopFile(File file) {
		if (!file.exists()) {
			return null;
		}
		List<String> result = new ArrayList<String>();
		if (file.isDirectory()) {
			return loopDir(file);
		}else {
			result.add(file.getAbsolutePath());
			return result;
		}
	}
	/**
	 * 根据一个目录文件，遍历所有的目录及文件的名称
	 * @param file
	 * @return
	 */
	public static List<String> loopDir(File file) {
		if (!file.exists()) {
			return null;
		}
		List<String> result = new ArrayList<String>();
		result.add(file.getAbsolutePath());
		File[] listFiles = file.listFiles();
		if (listFiles.length <=0) {
			return result;
		}
		for (int i = 0; i < listFiles.length; i++) {
			if (listFiles[i].isDirectory()) {
				List<String> loopDir = loopDir(listFiles[i]);
				result.addAll(loopDir);
			}else {
				result.add(listFiles[i].getAbsolutePath());
			}
		}
		return result;

	}

}
