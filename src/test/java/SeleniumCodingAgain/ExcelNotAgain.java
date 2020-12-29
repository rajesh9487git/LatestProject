package SeleniumCodingAgain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelNotAgain {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(2);

		Iterator<Row> rows = sheet.iterator();

		while (rows.hasNext()) {

			Row r = rows.next();

			if (r.getCell(0).getStringCellValue().equalsIgnoreCase("y")) {

				System.out.println(r.getCell(0).getStringCellValue());
				break;
			}

		}

	}

}
