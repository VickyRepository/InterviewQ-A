package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharater {

	/**
	 * 
	 * Question: Remove duplicate character in the given string
	 * 
	 */

	public static void removeDuplicate(String inputstring) {

		System.out.println("Before Removing Duplicate Element: " + inputstring);

		char[] chrArray = inputstring.toCharArray();

		Set<Character> charset = new LinkedHashSet<Character>();

		for (char c : chrArray) {
			charset.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character cha : charset) {
			sb.append(cha);
		}

		inputstring = sb.toString();

		System.out.println("After Removing Duplicate Element: " + inputstring);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		removeDuplicate("SaravanaStores");
	}

}
