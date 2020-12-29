package ProgramPractice;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		
		int no =7;
		int temp=0;
		
		for(int i=2;i<no;i++) {
			
			if(no%i==0) {
				
				temp=temp+1;
				break;
			}
		}
		
		if(temp>0) {
			
			System.out.println("not a prime no");
		}else {
			
			System.out.println("it is a prime no");
		}
	}

}
