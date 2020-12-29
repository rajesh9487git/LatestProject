package Apptio;

public class AllZerosToBeginning {

	public static void main(String[] args) {
		
		int [] a = {1,0, 34, 0, 3, 6, 123, 00, 1};
		int count=a.length-1;
		
		for(int i=a.length-1;i>=0;i--) {
		
			
			if(a[i]!=0) {
			
				//count will be decremented after the value is assigned, it will work as below code 
				//a[count]=a[i];
				//count--;
				
				a[count--]=a[i];
				
			}
		}
		
		while(count>=0) {
			a[count--]=0;
		}
		
		for(int k:a) {
			
			System.out.println(k);
		}
	}

}
