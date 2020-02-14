package JavaPrograms;

public class ANoisPrimeorNot {

	public static void main(String[] args) {
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
