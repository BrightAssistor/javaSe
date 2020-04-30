package com.bristor.Test;

import java.io.File;
import java.util.List;

import com.bristor.utils.FileUtils;

public class Test {

	public static void main(String[] args) {
		List<String> allFileNames = FileUtils.loopFile(new File("D://test//aa//qq.txt"));
		System.out.println(allFileNames.toString());
		List<String> allFileNames2 = FileUtils.loopDir(new File("D://test//aa//"));
		System.out.println(allFileNames2.toString());
	}

}
