package Academy;

import java.io.IOException;
import java.util.ArrayList;

public class Excel {

	public static void main(String[] args) throws IOException {
	
		
		ExcelUtility data = new ExcelUtility();
    ArrayList<String> data1=data.getData("purchase");
    
    System.out.println(data1.get(0));
    System.out.println(data1.get(1));
    System.out.println(data1.get(2));
    System.out.println(data1.get(3));

	}

}
