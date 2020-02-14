package Academy;

import java.util.Scanner;

public class PrintEvennosfrom1toGivenNos {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Limit:-");
		
		int noLimit=sc.nextInt();
		
		System.out.println("Print even nos between 1 and " + noLimit);
		
		for(int i=1;i<=noLimit;i++) {
			
			if(i%2==0) {
				
				System.out.println(i);
				
			}
		}
				
		

	}

}
