package ProgramPractice;

public class StringPalindrome {

	public static void main(String[] args) {
	
		String s="Rajesh";
		String c="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			c=c+s.charAt(i);
		}

		System.out.println(c);
	}

}
