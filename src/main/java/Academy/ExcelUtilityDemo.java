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

public class ExcelUtilityDemo {

	ArrayList<String> a = new ArrayList<String>();

	public ArrayList<String> getExcelData(String Tc) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheetCount = wb.getNumberOfSheets();
		for (int i = 0; i < sheetCount; i++) {
			if (wb.getSheetAt(i).getSheetName().equalsIgnoreCase("TestData")) {
				XSSFSheet sheet = wb.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				Iterator<Cell> cell = firstRow.cellIterator();
				int k = 0;
				int column = 0;
				while (cell.hasNext()) {
					if (cell.next().getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;

					}
					k++;
				}
				System.out.println(column);
				while (rows.hasNext()) {

					Row ce = rows.next();
					if (ce.getCell(column).getStringCellValue().equalsIgnoreCase(Tc)) {

						Iterator<Cell> ce1 = ce.cellIterator();
						while (ce1.hasNext()) {
							Cell de = ce1.next();
							if (de.getCellType() == CellType.STRING) {

								a.add(de.getStringCellValue());
							} else {

								a.add(NumberToTextConverter.toText(de.getNumericCellValue()));
							}

						}
					}
				}
			}

		}
		return a;
	}

}
