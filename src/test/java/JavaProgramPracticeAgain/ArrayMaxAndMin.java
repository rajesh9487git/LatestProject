package JavaProgramPracticeAgain;

public class ArrayMaxAndMin {

	public static void main(String[] args) {
		
		int [] a = {33,22,1,35,0,6,98};
		
		int max = a[0];
		int min =a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(max<a[i]) {
				
				max=a[i];
			}
			else if(min>a[i]) {
				
				min=a[i];
			}
		}
		
		System.out.println("Max is "+ max);
		System.out.println("Min is "+ min);
	}

}
 