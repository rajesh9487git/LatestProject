package Academy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		
		ArrayList<String> a = new ArrayList<String>();
		
		FileInputStream fis= new FileInputStream("C:\\UdemySeleniumVideos&Docs\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	   XSSFSheet sh= wb.getSheetAt(1);
	   System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
	   System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
	   
	   
	  Iterator<Row> rows=sh.iterator();
	  while(rows.hasNext()) {
		  
		  Row multipleRows=rows.next();
		  Iterator<Cell> cells1=multipleRows.cellIterator();
		  
		  while(cells1.hasNext()) {
			  
			  Cell ce=cells1.next();
			  a.add(ce.getStringCellValue());
		  }
		  
	  }
		
System.out.println(a);
	}

}
