package JavaPrograms;

public class MaxValueinArray {

	public static void main(String[] args) {
	
		int [] a = {3,5,88,99,5,6};
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(max<a[i]) {
				
				max=a[i];
			}
		}

		System.out.println(max);
	}

}
