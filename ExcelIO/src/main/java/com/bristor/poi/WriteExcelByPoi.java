package com.bristor.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;





import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcelByPoi {

	public static boolean writeExcel(List list,String filePath) {
		Workbook wb = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(new File(filePath));
			wb = createWorkbook1(filePath);
			for (int s = 0; s < list.size(); s++) {
				Sheet sheet = wb.createSheet("页码"+s);
				List sheetList =(List)list.get(s);
				for (int r = 0; r < sheetList.size(); r++) {
					Row createRow = sheet.createRow(r);
					List cellList =(List)sheetList.get(r);
					for (int c = 0; c < cellList.size(); c++) {
						String content = (String)cellList.get(c);
						Cell createCell = createRow.createCell(c);
						createCell.setCellValue(content);
					}
				}
			}
			wb.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			try {
				if (fos!=null) {
					fos.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return true;

	}

	
	public static Workbook createWorkbook1(String filePath) {
		Workbook wb = null;
		String suffix = filePath.substring(filePath.lastIndexOf("."));
		if (".xls".equals(suffix)) {
			wb = new HSSFWorkbook();
		} else if (".xlsx".equals(suffix)) {
			wb = new XSSFWorkbook();
		} else {
			return wb;
		}	
		
		return wb;
		
	}

}
