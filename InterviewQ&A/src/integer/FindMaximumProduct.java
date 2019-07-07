package integer;

public class FindMaximumProduct {

	/**
	 * 
	 * Question: Find the maximum product in the given array
	 * 
	 */

	public static void getMaximumProduct(int[] array) {

		int a = array[0];
		int b = array[1];

		for (int i = 1; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if (array[i] * array[j] > a * b) {
					a = array[i];
					b = array[j];
				}
			}

		}

		System.out
				.println("The largest two number in the array is " + a + " & " + b + " and their product is " + a * b);

	}

	public static void main(String[] args) {

		int[] array = { 1, 4, 5, 6, 7 };

		getMaximumProduct(array);

	}

}
