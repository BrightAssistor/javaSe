package com.bristor.jxl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import jxl.Sheet;
import jxl.Workbook;
import jxl.biff.EmptyCell;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class ModifyExcelByJxl {
	public static boolean modifyExcel(int source,int column,String filePath) {
		try {
			System.out.println("modify begin***************************************************************************");
			File file = new File(filePath);
			Workbook workbook = Workbook.getWorkbook(file);
			WritableWorkbook wb = Workbook.createWorkbook(file,workbook);
			for (int i = 0; i < wb.getNumberOfSheets(); i++) {
				WritableSheet sheet = wb.getSheet(i);
				for (int r = 0; r < sheet.getRows(); r++) {
					String sourceString = sheet.getCell(source, r).getContents();
					if (sourceString == null || "".equals(sourceString) || sourceString.length() == 0) {
						continue;
					}
					Label label = new Label(column, r,String.valueOf(sourceString.length()));
//					label.setCellFormat(sheet.getCell(source, r).getCellFormat());
					sheet.addCell(label);
				}
			}
			wb.write();
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
}
