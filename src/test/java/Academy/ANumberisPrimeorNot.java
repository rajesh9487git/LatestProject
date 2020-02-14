package Academy;

public class ANumberisPrimeorNot {

	public static void main(String[] args) {
		
		//A prime number is a whole number greater than 1 whose only factors are 1 and itself
		
		int a=2;
		int temp=0;
		
		
		for(int i=2; i<a;i++) {
			
			if(a%i==0) {
				
				temp=temp+1;
				
			}
			
			}
		
		System.out.println(temp);
		
		if(temp>0) {
			
			System.out.println("Given no is not a Prime no");
		}
		else {
			
			System.out.println("Given no is a Prime no");
		}
		
	}

}
