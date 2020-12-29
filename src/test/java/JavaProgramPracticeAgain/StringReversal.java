package JavaProgramPracticeAgain;

public class StringReversal {

	public static void main(String[] args) {

		String s = "Rajeshr";

		String c = "";
		
		System.out.println(s);

		for (int i = s.length() - 1; i >= 0; i--) {

			c = c + s.charAt(i);
		}

		System.out.println(c);
	}

}
