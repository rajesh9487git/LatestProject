package JavaPrograms23Nov;

public class StringReversal {

	public static void main(String[] args) {

		String s = "Rajesh";
		String b = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			b = b + s.charAt(i);

		}

		System.out.println(b);
	}

}
