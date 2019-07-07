package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashmapFunction {

	/**
	 * 
	 * Question: Store the user name user's hobbies in the hashmap and create a
	 * method to return user names based on the hobbies.
	 * 
	 */

	public static List<String> getList(HashMap<String, List<String>> map, String value) {

		List<String> list = new ArrayList<>();

		for (String s : map.keySet()) {
			if (map.get(s).stream().anyMatch(value::equalsIgnoreCase)) {
				/*
				 * if (map.get(s).contains(value)) We can use contains method as well but that
				 * should display the data only if the cases of the string matches.
				 */
				list.add(s);
			}
		}

		return list;

	}

	public static void main(String[] args) {

		HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>();

		hashMap.put("Vignesh", Arrays.asList("Badmiton", "Cricket"));
		hashMap.put("Somusankar", Arrays.asList("Cricket", "Carrom"));
		hashMap.put("Saran", Arrays.asList("Cards", "Carrom"));
		hashMap.put("Sridevi", Arrays.asList("Badmiton", "Squash"));

		System.out.println(getList(hashMap, "cricket"));
	}

}
