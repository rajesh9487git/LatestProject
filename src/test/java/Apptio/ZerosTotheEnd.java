package Apptio;

public class ZerosTotheEnd {

	public static void main(String[] args) {
		
		int [] a = {1,0, 34, 0, 3, 6, 123, 00, 1};
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]!=0) {
				
				a[count]=a[i];
				count++;
			}
		}

		while(count<a.length) {
			a[count]=0;
			count++;
			
		}
		
		for(int k:a)
			System.out.println(k);
	}

}
