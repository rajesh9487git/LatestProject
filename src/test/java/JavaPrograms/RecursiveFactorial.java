package JavaPrograms;

import org.testng.annotations.Test;

public class RecursiveFactorial {
	
	int fact=1;
	
	public static void main(String[] args) {
		
		RecursiveFactorial rf = new RecursiveFactorial();
		int no=rf.recur(5);
		System.out.println(no);
		
		
	}

	public int recur(int n) {
		
		if(n>=1) {
			
			fact=fact*n;
			recur(n-1);
		}
return fact;
	}

}
