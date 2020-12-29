package JavaPrograms;

public class RemovinElementFromArray {

	public static void main(String[] args) {
	
		int [] a = {3,88,66,5,8,1,87};
		int ele=8;
	
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==ele) {
				
				for(int j=i;j<a.length-1;j++) {
					
					a[j]=a[j+1];
					
				}
				//break;
			}
			
		}
for(int k=0;k<a.length-1;k++) {
	System.out.println(a[k]);
}
		
		
	}

}
