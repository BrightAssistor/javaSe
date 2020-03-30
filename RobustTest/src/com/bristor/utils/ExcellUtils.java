package com.bristor.utils;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellUtils {
	public static Workbook getWorkbook(String filePath) {
		try {

			String type = filePath.split(CommonConfigs.SPLITDOT)[1];
			if (CommonConfigs.EXCELL_XLSX.equals(type)) {
				XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(filePath));
				return xssfWorkbook;
			} else {
				HSSFWorkbook hssfWorkbook = new HSSFWorkbook(new FileInputStream(filePath));
				return hssfWorkbook;
			}
		} catch (Exception e) {

		}
		return null;

	}
	public static String getStringValue(Cell cell) {
		String result= null;
		switch (cell.getCellTypeEnum()) {
		case BOOLEAN:
			result = String.valueOf(cell.getBooleanCellValue());
			break;
		case NUMERIC:
			result = String.valueOf(cell.getNumericCellValue());
			if (result.indexOf(".")>=0) {
				result = result.split(CommonConfigs.SPLITDOT)[0];
			}
			break;
		case STRING:
			result = String.valueOf(cell.getStringCellValue());
			break;
		case ERROR:
			result = String.valueOf(cell.getErrorCellValue());
			break;
		default:
			break;
		}
		return result;
	}
	public static String getStringValueByForce(Cell cell) {
		cell.setCellType(CellType.STRING);
		return String.valueOf(cell.getStringCellValue());
	}

	public static String getCellValueByRow(HSSFRow row,int keyIndex) {
		if (row == null) {
			return null;
		}
		HSSFCell cell = row.getCell(keyIndex);
		if (cell == null) {
			return null;
		}
		return getStringValueByForce(cell);
	}
	public static HSSFCell getCell(HSSFRow row,int keyIndex) {
		if (row == null) {
			return null;
		}
		HSSFCell cell = row.getCell(keyIndex);
		if (cell == null) {
			return null;
		}
		return cell;
	}
	public static HSSFCell getOrCreateCell(HSSFSheet sheet,int rowIndex,int columnIndex) {
		HSSFRow row = sheet.getRow(rowIndex);
		if (row == null) {
			row = sheet.createRow(rowIndex);
		}
		HSSFCell cell = row.getCell(columnIndex);
		if (cell == null) {
			cell = row.createCell(columnIndex);
		}
		return cell;
	}
	public static void setColumnName(HSSFSheet sheet,int rowIndex ,int resultNum,String columnName) {
		HSSFCell cell = getOrCreateCell(sheet, rowIndex, resultNum);
		cell.setCellValue(columnName);
		sheet.setColumnWidth(resultNum, columnName.length()*512);
	}
	public static void setAutoWrap(Workbook workbook,Cell cell) {
		CellStyle style = workbook.createCellStyle();
		style.setWrapText(true);
		cell.setCellStyle(style);
	}


}
