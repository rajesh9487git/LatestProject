package JavaPrograms23Nov;

public class SpclCharInStringToBegining {

	public static void main(String[] args) {

		String s = "@45rajesh!@$uiiir&*!";
		String regex = "[^a-z0-9A-Z]";

		String s1 = "";
		String s2 = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (s.valueOf(c).matches(regex)) {

				s1 = s1 + c;
			} else {

				s2 = s2 + c;
			}
		}

		System.out.println(s1 + s2);

	}

}
