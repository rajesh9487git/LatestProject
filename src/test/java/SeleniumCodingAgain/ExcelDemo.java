package SeleniumCodingAgain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String s = sheet.getRow(0).getCell(0).getStringCellValue();
		
		
		
		
		
		
		

	}

}
