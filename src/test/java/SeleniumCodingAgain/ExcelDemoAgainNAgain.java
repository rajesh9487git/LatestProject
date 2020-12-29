package SeleniumCodingAgain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemoAgainNAgain {

	public static void main(String[] args) throws IOException {

		ArrayList<String> a = new ArrayList<String>();

		FileInputStream fis = new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		int sheetCount = wb.getNumberOfSheets();

		for (int i = 0; i < sheetCount; i++) {

			if (wb.getSheetName(i).equalsIgnoreCase("TestData")) {

				XSSFSheet sheet = wb.getSheetAt(i);

				Iterator<Row> row = sheet.iterator();

				Row firstRow = row.next();

				Iterator<Cell> ce = firstRow.cellIterator();

				int k = 0;
				int column = 0;

				while (ce.hasNext()) {

					if (ce.next().getStringCellValue().equalsIgnoreCase("testcases")) {

						column = k;
					}

					k++;

				}

				while (row.hasNext()) {

					Row r = row.next();

					if (r.getCell(column).getStringCellValue().equalsIgnoreCase("purchase")) {

						Iterator<Cell> celValue = r.cellIterator();

						while (celValue.hasNext()) {

							Cell cee = celValue.next();

							a.add(cee.getStringCellValue());

						}

					}
				}

			}

		}
	}

}
