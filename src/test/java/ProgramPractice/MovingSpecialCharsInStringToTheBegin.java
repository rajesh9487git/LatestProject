package ProgramPractice;

public class MovingSpecialCharsInStringToTheBegin {

	public static void main(String[] args) {

		String s = "@45rajesh!@$uiiir&*!";

		String s1 = "";
		String s2 = "";
		String regex = "[^a-zA-Z0-9]";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (s.valueOf(c).matches(regex)) {

				s1 = s1 + c;
			} else {

				s2 = s2 + c;

			}

		}

		System.out.println(s1+s2);
	}

}
