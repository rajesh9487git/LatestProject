package Academy;

public class FibonacciDemo {

	public static void main(String[] args) {
		
		//The Fibonacci series is a series where the next term is the sum of pervious two terms. The first two terms of the Fibonacci sequence is 0 followed by 1.
		
		int a=0;
		int b=1;
		int c;
		
		//System.out.println(a);
		//System.out.println(b);
		
		for(int i=1;i<=10;i++) {
			
			c=a+b;
			System.out.println(c);
			
			a=b;
			b=c;
			
		}
		
	}

}
