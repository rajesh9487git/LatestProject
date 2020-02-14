package JavaPrograms;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		String s = "Rajesh";
		System.out.println("Enter a String");
		int d =scan.nextInt();
		//scan.nextLine();
		String s1 = scan.nextLine();
		
		String concat= s+s1;
		System.out.println(concat);
		
		scan.close();

	}

}
