package com.bristor.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.bristor.utils.ExcellUtils;

public class MutiDataQuery {
	public String query() {
		return null;

	}
	public static void modifyXlsExcel(String fileName,int conditionIndex,int resultIndex) {
		String filePath = System.getProperty("user.dir") + File.separator + "src\\config\\" + fileName;
		Workbook workbook = ExcellUtils.getWorkbook(filePath);
		FileOutputStream out = null;
		try {
			HSSFSheet sheet = (HSSFSheet) workbook.getSheet("Sheet1");
			for (int i = 0; i <= 10; i++) {
                HSSFRow row = sheet.getRow((short)i);
                if (null == row) {
                	row = sheet.createRow((short)i);
                }
                HSSFCell cell = row.getCell((short)conditionIndex);
                if (null == cell) {
                	cell = row.createCell((short)conditionIndex);
                }
            	String temp = cell.getStringCellValue();
            	cell.setCellValue(temp + "test"+i);

            }

			out = new FileOutputStream(filePath);
			workbook.write(out);
			System.out.println("end.....");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}


}
