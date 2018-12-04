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

public class WriteExcelByJxl {
	public static boolean writeExcel(List list,String filePath) {
		try {
			System.out.println("write begin***************************************************************************");
			WritableWorkbook wb = Workbook.createWorkbook(new File(filePath));
			for (int i = 0; i < list.size(); i++) {
				WritableSheet sheet = wb.createSheet("页码"+i, i);
				List sheetList =(List)list.get(i);
				System.out.println("sheet"+i+"["+sheet.getName()+"]begin*******************");
				for (int j = 0; j < sheetList.size(); j++) {
					List cellList =(List)sheetList.get(j);
					for (int k = 0; k < cellList.size(); k++) {
						String content = (String)cellList.get(k);
						Label label = new Label(k, j,content);
						sheet.addCell(label);
					}
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
		}
		
		return true;
		
	}
}
