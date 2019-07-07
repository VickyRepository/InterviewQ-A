package string;

import java.util.HashMap;
import java.util.Set;

public class CountOccurrenceOfWord {

	/**
	 * 
	 * Question: Count the occurrence of word in a given string and print the word
	 * occurred more than one time
	 * 
	 */

	public static void duplicateWord(String inputstring) {

		String[] strArray = inputstring.split("\\s");

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		for (String str : strArray) {

			if (hashMap.containsKey(str)) {

				hashMap.put(str, hashMap.get(str) + 1);

			}

			else {
				hashMap.put(str, 1);
			}

		}

		Set<String> setmap = hashMap.keySet();

		for (String st : setmap) {

			if (hashMap.get(st) > 1) {

				System.out.println(st + ":" + hashMap.get(st));

			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		duplicateWord("Java is java and again is java");
	}

}
