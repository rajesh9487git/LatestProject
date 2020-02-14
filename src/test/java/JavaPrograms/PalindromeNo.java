package JavaPrograms;

public class PalindromeNo {

	public static void main(String[] args) {
		
		int givenNo= 783;
		int rem;
		int rev=0;
		int temp=givenNo;
		
		
		while(temp!=0) {
			
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		

		System.out.println(rev);
		
		if(rev==givenNo) {
			
			System.out.println("Palindrome");
			
		} else {
			System.out.println("Not a Palindrome");
		}
		
		
	}

}
