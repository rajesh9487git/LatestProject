package Academy;

public class FactorialNo {

	public static void main(String[] args) {
		//A factorial is a function that multiplies a number by every number below it.

//For example: 5!= 5*4*3*2*1=120.
		
		
		int givenNo=5;
		
		for(int i=givenNo-1;i>1;i--) {
			
			givenNo=givenNo*i;
			
		}
		
		
		System.out.println("factorial no is " + givenNo);
		
		

	}

}
