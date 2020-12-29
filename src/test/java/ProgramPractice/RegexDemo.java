package ProgramPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("[a-zA-Z0-9]");
		Matcher m = p.matcher("rajesh@33@");

		while (m.find()) {

			System.out.println(m.start() + "------------------ " + m.group());
		}

	}

}
