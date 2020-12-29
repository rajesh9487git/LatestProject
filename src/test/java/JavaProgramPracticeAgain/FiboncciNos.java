package JavaProgramPracticeAgain;

public class FiboncciNos {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		
		int no=20;
		
		for(int i=1;i<=no;i++) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
					
		}

	}

}
