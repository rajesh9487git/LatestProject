package JavaPrograms;

public class StringArraySortingSelectionTech {

	public static void main(String[] args) {
		
		String [] a= {"Rajesh", "Kaira","Niki","Rambo","Abcd"};
		String temp;
		
		for(int i=0;i<a.length;i++) {
			int min=i;
			
			for(int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[min])<0) {
					min=j;
				}
			}
			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}

		for(String k: a)
			System.out.println(k);
	}

}
