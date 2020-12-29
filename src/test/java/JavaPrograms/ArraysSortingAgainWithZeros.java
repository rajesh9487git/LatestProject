package JavaPrograms;

public class ArraysSortingAgainWithZeros {

	public static void main(String[] args) {
		
		int [] a= {1,6,7,0,9,0,0,9,0};
		
		int temp;
		for(int i=0;i<a.length;i++) {
			
			for(int j=i;j<a.length;j++) {
				
				if(a[i]==0) {
					break;
				}
				else if(a[j]==0) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int ar:a)
			System.out.println(ar);

	}

}
