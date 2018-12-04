package com.bristor.jxl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelByJxl {
	public static List readExcel(String filePath) {
		List result = new ArrayList<ArrayList<ArrayList<String>>>();
		try {
			Workbook workbook = Workbook.getWorkbook(new File(filePath));
			Sheet[] sheets = workbook.getSheets();
			for (int i = 0; i < sheets.length; i++) {
				Sheet sheet = sheets[i];
				System.out.println("sheet"+i+"["+sheet.getName()+"]begin*******************");
				ArrayList<ArrayList<String>> rows = new ArrayList<ArrayList<String>>();
				for (int r = 0; r < sheet.getRows(); r++) {
					System.out.println("row"+r+"[begin*******************");
					ArrayList<String> columns = new ArrayList<String>();
					for (int c = 0; c < sheet.getColumns(); c++) {
						System.out.println("column"+c+"[begin*******************");
						String contents = sheet.getCell(c, r).getContents();
						columns.add(contents);
					}
					rows.add(columns);
				}
				result.add(rows);
			}
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
