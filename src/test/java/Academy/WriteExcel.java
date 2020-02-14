package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		sheet.getRow(0).createCell(6).setCellValue("pass");
		sheet.getRow(1).createCell(6).setCellValue("fail");
		
		FileOutputStream fout = new FileOutputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");
		wb.write(fout);
		wb.close();
		
		
	}

}
