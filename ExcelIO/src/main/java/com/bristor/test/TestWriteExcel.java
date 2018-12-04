package com.bristor.test;

import java.io.File;
import java.util.List;

import com.bristor.jxl.ReadExcelByJxl;
import com.bristor.jxl.WriteExcelByJxl;
import com.bristor.poi.ReadExcelByPoi;
import com.bristor.poi.WriteExcelByPoi;

public class TestWriteExcel {

	public static void main(String[] args) {
		String filePath1 = "D:\\协议酒店上海2018.xlsx";
		String filePath2 = "D:\\协议酒店上海2018_modify124.xlsx";
//		List result = ReadExcelByJxl.readExcel(path1);
//		boolean writeExcel = WriteExcelByJxl.writeExcel(result, path2);
		List result = ReadExcelByPoi.readExcel(filePath1);
		boolean writeExcel =WriteExcelByPoi.writeExcel(result, filePath2);
		System.out.println(writeExcel);

	}

}
