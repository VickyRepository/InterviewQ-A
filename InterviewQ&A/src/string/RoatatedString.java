package string;

public class RoatatedString {

	/**
	 * 
	 * Question: check whether the given strings is rotated or not.
	 * 
	 */

	public static void isStringRoatated(String str, String str1) {

		if (str1.length() != str1.length()) {
			System.out.println("It's not a rotated String");
		}

		else {
			String str2 = str + str1;

			if (str2.contains(str)) {
				System.out.println("It's a roatated String");
			} else {
				System.out.println("It's not a roatated String");
			}
		}
	}

	public static void main(String[] args) {

		String string1 = "Java";
		String string2 = "avaJ";

		isStringRoatated(string1, string2);
	}
}
