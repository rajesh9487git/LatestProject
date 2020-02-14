package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtility {

	@Test
	public ArrayList<String> getData(String TescaseName) throws IOException {

		ArrayList<String> a = new ArrayList<String>();

		FileInputStream fis = new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		int sheets = wb.getNumberOfSheets();

		System.out.println(sheets);

		for (int i = 0; i < sheets; i++) {

			if (wb.getSheetName(i).equalsIgnoreCase("testdata")) {

				XSSFSheet sheet = wb.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();

				Iterator<Cell> cells = firstRow.cellIterator();

				int k = 0;
				int column = 0;

				while (cells.hasNext()) {

					if (cells.next().getStringCellValue().equalsIgnoreCase("testcases")) {

						column = k;
					}

					k++;
				}
				System.out.println(column);

				while (rows.hasNext()) {

					Row ce = rows.next();

					if (ce.getCell(column).getStringCellValue().equalsIgnoreCase(TescaseName)) {

						Iterator<Cell> cv = ce.cellIterator();

						while (cv.hasNext()) {

							Cell de = cv.next();

							if (de.getCellType() == CellType.STRING) {

								a.add(de.getStringCellValue());
							} else {

								a.add(NumberToTextConverter.toText(de.getNumericCellValue()));
							}

						}

						// System.out.println(a);

					}
				}

			}

		}

		return a;

	}

}