package JavaPrograms;

public class StringPalindrome {

	public static void main(String[] args) {

		String a = "rajesh";
		String b = "";

		for (int i = a.length() - 1; i >= 0; i--) {

			b = b + a.charAt(i);
		}

		System.out.println(b);

		if(a.equalsIgnoreCase(b)) {

			System.out.println("Given String is a Palindrome");
		} 
		
		else {
			
			System.out.println("Given String is not a Palindrome");
			
			System.out.println("ABCD");
		}
	}

}
