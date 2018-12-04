package com.bristor.test;

import java.util.List;

import com.bristor.jxl.ReadExcelByJxl;
import com.bristor.poi.ReadExcelByPoi;

public class TestReadExcel {

	public static void main(String[] args) {
		String filePath = "D:\\协议酒店上海2018.xls";
//		List result = ReadExcelByJxl.readExcel(filePath);
		List result = ReadExcelByPoi.readExcel(filePath);
		for (int i = 0; i < result.size(); i++) {
			List object = (List)result.get(i);
			for (int j = 0; j < object.size(); j++) {
				System.out.println(object.get(j));
			}
		}
		System.out.println(result);

	}

}
