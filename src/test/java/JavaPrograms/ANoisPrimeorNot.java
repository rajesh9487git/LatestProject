package JavaPrograms;

public class ANoisPrimeorNot {

	public static void main(String[] args) {
		
		//In math, prime numbers are whole numbers greater than 1, that have only two factors – 1 and the number itself.
		//Prime numbers are divisible only by the number 1 or itself.  
		//For example, 2, 3, 5, 7 and 11 are the first few prime numbers.
		int no=6;
		int temp=0;
		
		for(int i=2;i<no;i++) {
			
			if(no%i==0) {
				
				temp=temp+1;
			}break;
		}
		
		System.out.println(temp);
		if(temp>0) {
			
			System.out.println("Not a Prime no");
		}else {
			
			System.out.println("prime no");
		}
	}

}
