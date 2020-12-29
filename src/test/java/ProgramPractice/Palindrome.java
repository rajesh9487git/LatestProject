package ProgramPractice;

public class Palindrome {

	public static void main(String[] args) {
		
		int n = 123;
		int rev=0;
		int rem;
		int temp=n;
		
		while(temp!=0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		

		System.out.println(rev);
	}

}
