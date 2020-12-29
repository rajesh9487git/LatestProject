package HackerRank;

public class ParseStringToInteger {

	public static void main(String[] args) {

		String s = "uu";

		try {

			System.out.println(Integer.parseInt(s));
		} catch (NumberFormatException e) {

			System.out.println("Bad String");
		}

	}

}