package SeleniumCodingAgain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		sheet.getRow(0).createCell(0).setCellValue("Rajesh");
		
		FileOutputStream fout = new FileOutputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");
		
		wb.write(fout);
		wb.close();

	}

}

