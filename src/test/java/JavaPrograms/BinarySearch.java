package JavaPrograms;

public class BinarySearch {

	public static void main(String[] args) {
		
		//searching a given no using Binary search
		
		int [] a = {3,5,6,7,9,10,34,56,87};
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		int ele=56;
		
	while(li<=hi) {
		
		if(a[mi]==ele) {
			System.out.println(mi+" position");
			break;
		}
		else if(a[mi]<ele) {
			li=mi+1;
			
		}
		else {
			hi=mi-1;
		}
		
		mi=(li+hi)/2;
	}}

}
