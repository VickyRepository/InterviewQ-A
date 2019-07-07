package integer;

public class FindMissingNumber {
	
	/**
	 * 
	 *Question: Find the  missing number in the given array
	 *
	 */
	
	public static void getMissingNumber(int[] array, int n) {
		
		int total = (n+1)*(n+2)/2;
		
		for(int i=0 ; i<n; i++) {
			total -=array[i];
		}
		
		System.out.println("Missing number in the array is "+total);
		
	}

	public static void main(String[] args) {
		
		int[] array= {1,2,4,5};
		getMissingNumber(array, array.length);
	}

}
