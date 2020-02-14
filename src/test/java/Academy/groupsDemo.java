package Academy;

import org.testng.annotations.Test;

public class groupsDemo {
	
	
	@Test
	public void demo1() {
		
		System.out.println("Printing from demo1");
	}
	
	
	@Test(groups= {"Smoke"})
	public void demo2() {
		
		System.out.println("Printing from demo2");
	}
	
	
	@Test
	public void demo3() {
		
		System.out.println("Printing from demo3");
	}


}
