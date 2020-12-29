package JavaPrograms23Nov;

public class RemovingJunkFromString {

	public static void main(String[] args) {

		String s = "@#!this is real world %^&876";

		String p = s.replaceAll("[^a-z0-9A-Z\\s]", "");
		
		

		System.out.println(p);

	}

}
