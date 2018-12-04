package com.bristor.test;

import java.io.File;
import java.util.List;

import com.bristor.jxl.ModifyExcelByJxl;
import com.bristor.jxl.ReadExcelByJxl;
import com.bristor.jxl.WriteExcelByJxl;
import com.bristor.poi.ModifyExcelByPoi;
import com.bristor.poi.ReadExcelByPoi;

public class TestModifyExcel {

	public static void main(String[] args) {
		String filePath = "D:\\新建 Microsoft Excel 工作表.xlsx";
//		boolean result = ModifyExcelByJxl.modifyExcel(1, 4, filePath);
		boolean result = ModifyExcelByPoi.modifyExcel(1, 6, filePath);
		System.out.println("result:"+result);

	}

}
