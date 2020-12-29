package JavaPrograms;

public class RemoveJunkValuesFromString {

	public static void main(String[] args) {
	
		String s = "@#!this is real world %^&876";
		//[^\\w\\s]
		
		s= s.replaceAll("[^\\w\\s]", "");
		
		System.out.println(s);

	}

}
