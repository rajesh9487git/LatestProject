package JavaPrograms;

public class ArraysSelection {

	public static void main(String[] args) {
		
		
		int [] a = {8,9,54,1,23,5};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[j]<a[min]) {
					
					min=j;
				}
				
			}
			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		for(int k: a)
			System.out.println(k);
	}

}
