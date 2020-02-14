package Academy;

public class ANumberisPrimeorNot01 {

	public static void main(String[] args) {
		
		int no=100;
		
		for(int i=2;i<=no-1;i++) {
			
			if(no%i==0) {
				
				System.out.println("Given no is not a Prime no");
			}else {
				
				System.out.println("Given no is a Prime no");
				
			}
			
			break;
		}
		
	}

}
