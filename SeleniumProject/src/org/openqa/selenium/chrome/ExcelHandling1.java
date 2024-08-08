package org.openqa.selenium.chrome;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling1 {
	
	private static final char[] a = null;

	public static void main(String[] args) throws Exception{
		
String path = "C:\\Jeffson\\TESTING\\Self Time Table.xlsx";
		
		FileInputStream newf = new FileInputStream(path);
		XSSFWorkbook openFile = new XSSFWorkbook(newf);
		XSSFSheet openSheet = openFile.getSheet("TimeTable");
		XSSFRow getRow = openSheet.getRow(1);
		XSSFCell getCell = getRow.getCell(2);
		
		String print = getCell.getStringCellValue();
		System.out.println(print);
		
		openFile.close();
		
		
		
		
		
		
		
	}

}
