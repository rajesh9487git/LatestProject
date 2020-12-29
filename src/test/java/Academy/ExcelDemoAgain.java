package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemoAgain {

	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ExcelDemoAgain() throws IOException {

		FileInputStream fis = new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");
		this.wb = new XSSFWorkbook(fis);
	}

	public String getValues(int sheetIndex, int row, int col) {

		sheet = wb.getSheetAt(sheetIndex);
		String value = sheet.getRow(row).getCell(col).getStringCellValue();
		return value;

	}
	
	public int getRow(int sheetIndex) {
		
		sheet=wb.getSheetAt(sheetIndex);
		int rowCount=sheet.getLastRowNum();
		rowCount=rowCount+1;
		return rowCount;
	}

}
