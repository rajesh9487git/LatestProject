package JavaProgramPracticeAgain;

public class RemovingJunkFromString {

	public static void main(String[] args) {

		String s = "@#!this is real world %^&876";

		s=s.replaceAll("[^a-zA-Z0-9\\s]", "");

		System.out.println(s);

	}

}
