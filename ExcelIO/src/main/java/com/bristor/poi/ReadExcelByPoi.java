package com.bristor.poi;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelByPoi {

	public static List readExcel(String filePath) {
		List result = new ArrayList<List<List<String>>>();
		Workbook wb = null;
		try {
			wb = readWorkbook(filePath);
	            
			for (int i = 0; i < wb.getNumberOfSheets(); i++) {
				Sheet sheet = wb.getSheetAt(i);
				System.out.println("sheet"+i+"["+sheet.getSheetName()+"]"+"begin********************************");
				List rows = new ArrayList<List<String>>();
				for (int r = 0; r < sheet.getLastRowNum(); r++) {
					System.out.println("row"+r+"begin********************************");
					List<String> cells = new ArrayList<String>();
					Row row = sheet.getRow(r);
					for (int j = 0; j < row.getLastCellNum(); j++) {
						Cell cell = row.getCell(j);
						String stringValue = getStringValue(cell);
						if (stringValue == null) {
							continue;
						}
						cells.add(stringValue);
					}
					rows.add(cells);
				}
				result.add(rows);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public static Workbook readWorkbook(String filePath) {
		Workbook wb = null;
		FileInputStream fis = null;
		try {
			String suffix = filePath.substring(filePath.lastIndexOf("."));
			fis = new FileInputStream(filePath);
			if (".xls".equals(suffix)) {
				wb = new HSSFWorkbook(fis);
			} else if (".xlsx".equals(suffix)) {
				wb = new XSSFWorkbook(fis);
			} else {
				return wb;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (fis!=null) {
					fis.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		
		return wb;

	}
	public static String getStringValue(Cell cell ) {
		String string = null;
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_BLANK:
			break;
		case Cell.CELL_TYPE_BOOLEAN:
			string = String.valueOf(cell.getBooleanCellValue());
			break;
		case Cell.CELL_TYPE_ERROR:
			string = String.valueOf(cell.getErrorCellValue());
			break;
		case Cell.CELL_TYPE_FORMULA:
			break;
		case Cell.CELL_TYPE_NUMERIC:
			string = String.valueOf(cell.getNumericCellValue());
			break;
		case Cell.CELL_TYPE_STRING:
			string = String.valueOf(cell.getStringCellValue());
			break;
		default:
			break;
		}
		return string;
	}
}
