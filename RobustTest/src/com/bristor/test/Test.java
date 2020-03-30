package com.bristor.test;

import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Workbook;

import com.bristor.common.MutiDataQuery;
import com.bristor.utils.ExcellUtils;

public class Test {
	 public static void main(String[] args) {
	        try {
//	        	String path = "D:\\test2.xls";
//	        	Workbook workbook = ExcellUtils.getWorkbook(path);
//	            FileOutputStream out = new FileOutputStream("path");
//	            workbook.write(out);
//	            out.close();
//	        	MutiDataQuery.modifyXlsExcel("test2.xls", 1, 2);
	        	String index = "goodby ok <hello>meng</hello> goodby hello go";
	        	String key = "<hello>";
	        	String key2 = "</hello>";
	        	int indexOf = index.indexOf(key);
	        	System.out.println(indexOf);
	        	int indexOf2 = index.indexOf("g");
	        	System.out.println(indexOf2);
	        	int k1 =index.indexOf(key)+key.length();
	        	int k2 = index.indexOf(key2);
	        	String newv =index.substring(0, k1)+"zhou"+index.substring(k2);
	        	System.out.println(newv);
	        	System.out.println("/".equals("/"));
	        	HashMap<String,String> hashMap = new HashMap<String,String>();
	        	hashMap.put("key1", "");
	        	hashMap.put("key2", "");
	        	hashMap.put("key3", "");
	        	System.out.println(hashMap);
	        	if (hashMap.containsKey("key1")) {
	        		System.out.println("good");

				}

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
