package SeleniumCodingPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	XSSFWorkbook wb;
	XSSFSheet sh;
	
	
	public Excel() throws IOException {
		
		FileInputStream fis= new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data1.xlsx");
		wb=new XSSFWorkbook(fis);
		
	}
	
	public String getData(int sheetIndex, int row, int col) {
		
		sh = wb.getSheetAt(sheetIndex);
		String data=sh.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public int getLastrow(int sheetnum) {
		
		int lastRow= wb.getSheetAt(sheetnum).getLastRowNum();
		
		lastRow=lastRow+1;
		return lastRow;
	}

}
