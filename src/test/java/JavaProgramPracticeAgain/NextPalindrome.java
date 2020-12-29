package JavaProgramPracticeAgain;

public class NextPalindrome {

	public static void main(String[] args) {
	
		int n = 998;
		
		for (int i=n+1;i>=n;i++) {
			
			int temp=i;
			int rem;
			int rev=0;
			
			while(temp!=0) {
				
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
				
			}
			
			if(rev==i) {
				
				System.out.println(rev);
				break;
			}
		}

	}

}
