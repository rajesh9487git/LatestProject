package JavaPrograms;

public class NextPalindromeAgain {

	public static void main(String[] args) {
	
		int no=999;
		int rem;
		
		int temp;
		
		for(int i=no+1;i>=no;i++) {
			
			int rev=0;
			temp=i;
			
			while(temp!=0) {
				
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			
			if (rev==i) {
				System.out.println(rev);
				break;
				
			}
			
		}

		
	}

}
