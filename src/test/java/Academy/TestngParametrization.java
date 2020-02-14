package Academy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParametrization {
	
	@Parameters({"URL"})
	@Test
	public void LoginWithUrl(String urlname) {
		
		System.out.println(urlname);
	}
	
	
	
	@Test(dataProvider="getdata")
	public void Login(String username, String password) {
		
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
	@DataProvider
	public Object[][] getdata() {
		
		//first box of object represents no of rows and second represents no of columns
		Object [][] data = new Object [2][2];
		//first set of data
		data [0][0] = "firstusername";
		data [0][1] = "firstpassword";
		
		// second set of data
		data [1][0] = "secondusername";
		data [1][1] = "secondpassword";
		
		return data;
	}

}
