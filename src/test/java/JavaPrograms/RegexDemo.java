package JavaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("ca");
		Matcher m = p.matcher("abbbaabcaabbaab");

		while (m.find()) {

			System.out.println(m.start()+"-------"+m.end()+"------"+m.group());
		}

	}

}
