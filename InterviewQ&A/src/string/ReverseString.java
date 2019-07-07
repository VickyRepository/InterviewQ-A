package string;

public class ReverseString {
	
	/**
	 *
	 *Question: Reverse a given string
	 * 
	 */

	public static void main(String[] args) {
		
		String input = "vignesh";
		
		char[] chrArray = input.toCharArray();
		
		for(int i=chrArray.length-1; i>=0; i--) {
			System.out.print(chrArray[i]);
		}
	}

}
