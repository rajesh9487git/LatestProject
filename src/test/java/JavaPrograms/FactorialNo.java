package JavaPrograms;

public class FactorialNo {

	public static void main(String[] args) {
		
		int no=5;
		
		
		for(int i=no-1;i>1;i--) {
			
			 no=no*i;
		}
		
		System.out.println(no);
	}

}
