package JavaPrograms;

public class ArraySorting {

	public static void main(String[] args) {
		
		//moving all zeros to left
		
		int[] a = {5,6,6,5,6,0,4,0,6,0,0,2,3};
		int temp=0;
		
		for (int i=0;i<a.length;i++) {
			
			for(int j=i;j<a.length;j++) {
				
				/*if(a[i]==0) {
					
					break;
				}else*/ if(a[j]==0) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
			}
		}

		for(int ar: a)
			System.out.println(ar);
	}

	
}
