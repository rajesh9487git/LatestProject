package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(1);
		sheet.getRow(0).createCell(1).setCellValue("Rajesh");
		sheet.getRow(0).createCell(2).setCellValue("1");
		
		FileOutputStream fout= new FileOutputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");
		wb.write(fout);
		wb.close();

	}

}
