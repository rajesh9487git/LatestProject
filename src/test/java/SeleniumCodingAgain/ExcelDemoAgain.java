package SeleniumCodingAgain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemoAgain {

	

	XSSFWorkbook wb;
	XSSFSheet sheet;

	public String getExcelData(int sheetNo, int row, int col) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(sheetNo);
		String data = sheet.getRow(row).getCell(col).getStringCellValue();

		return data;

	}

	public int rowCount(int sheetNo) {

		sheet = wb.getSheetAt(sheetNo);

		int rowCount = sheet.getLastRowNum();

		return rowCount;

	}

}
