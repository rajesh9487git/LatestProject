package JavaPrograms;

public class FindMissingNumbersFromArray {

	public static void main(String[] args) {
		
		int [] a = {2,6,8,25,7};
		
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(max<a[i]) {
				max=a[i];
			}
			
			
		}
		
		int []b= new int [max+1];
		
	//System.out.println(b.length);
		
		for(int k:a) {
			
			b[k]=1;
		}
		
		
		for(int i=0;i<b.length;i++) {
			if(b[i]==0) {
				System.out.println(i);
			}
		}
	}

}
