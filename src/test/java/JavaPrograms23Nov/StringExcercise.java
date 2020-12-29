package JavaPrograms23Nov;

public class StringExcercise {

	public static void main(String[] args) {
	
		//Print HELLO for the given string "AHCECLWLXO"
		
		String s = "AHCECLWLXO";
		
		String [] s1 = s.split("");
		
		for(int i=1;i<s1.length;i=i+2) {
		
		System.out.println(s1[i].toUpperCase());

	}

}}
