package integer;

public class ReverseInteger {

	/**
	 * 
	 * Question: Reverse a given integer
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 4321, reversed=0;
		
		while(num!=0) {
			
			int digit = num%10;
			reversed = reversed*10 + digit;
			num/=10;
			
		}
		System.out.println(reversed);
	}

}
