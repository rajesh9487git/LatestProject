package JavaPrograms;

public class fibnocciUsingRecursive {
int a=0;
int b=1;
int c;
	public static void main(String[] args) {
		
		fibnocciUsingRecursive ar = new fibnocciUsingRecursive() ;
			ar.fibo(15);
			
		

	}
	
	public void fibo(int n) {
		
		if(n>=1) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			fibo(n-1);
		}
		
	}

}
