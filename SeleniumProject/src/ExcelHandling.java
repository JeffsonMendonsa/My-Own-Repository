import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {
	
	
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Jeffson\\TESTING\\Automation\\Java & Selenium.xlsx";
		
		FileInputStream newf = new FileInputStream(path);
		XSSFWorkbook openFile = new XSSFWorkbook(newf);
		XSSFSheet openSheet = openFile.getSheet("Data Type Sizes");
		XSSFRow getRow = openSheet.getRow(9);
		XSSFCell getCell = getRow.getCell(7);
		
		String print = getCell.getStringCellValue();
		System.out.println(print);
		
		openFile.close();
		
	}

}
