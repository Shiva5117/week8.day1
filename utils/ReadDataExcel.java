package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataExcel {

	@Test
	public static String[][] readData(String excelName) throws IOException {
		
		//Go to workbook using path
		XSSFWorkbook wbook = new XSSFWorkbook("Data/"+excelName+".xlsx");
		
		//Go to the sheet by index/name
		XSSFSheet dataSheet = wbook.getSheetAt(0);
		
		//Get Column count
		int rowCount = dataSheet.getLastRowNum();
		
		//Get row count
		short colCount = dataSheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][colCount];
		
		//Read all the content using nested loop
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = dataSheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				data[i-1][j] = cell.getStringCellValue();
			}
		}
		wbook.close();
		return data;

	}

}
