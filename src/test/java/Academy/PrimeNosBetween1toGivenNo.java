package Academy;

public class PrimeNosBetween1toGivenNo {

	public static void main(String[] args) {
		
		int givenNo=1000;
		
		for(int i=1;i<givenNo;i++) {
			
			int temp=0;
			
			for (int j=2;j<i;j++) {
				
				if(i%j==0) {
					
					temp=temp+1;
					break;
				}
				
				}
			
			if(temp==0) {
				
				System.out.println(i);
			}
			
			
		}
		
		

	}

}
