package Academy;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
	
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter the no:");
		
		int givenNo = 1265;
		int rem;
		int rev=0;
		
		
		while(givenNo!=0) {
			
			rem=givenNo%10;
			rev=rev*10+rem;
			givenNo=givenNo/10;
		}
		
		System.out.println(rev);
		
	}

}
