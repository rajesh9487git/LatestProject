package Academy;

public class WrapperDemo {

	public static void main(String[] args) {
		Integer x = new Integer(5);//assign new integer to x
		Integer y = x;//y refences same integer as x
		x= 6;//modify x with new value
		Integer z=x+1;
		
	
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
