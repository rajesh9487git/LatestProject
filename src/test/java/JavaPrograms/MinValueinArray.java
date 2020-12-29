package JavaPrograms;

public class MinValueinArray {

	public static void main(String[] args) {
		
		int [] a = {3,9,77,88,0,-3};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			
			if(min>a[i]) {
				min=a[i];
			}
		}

		System.out.println(min);
	}

}

