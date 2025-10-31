// Prints a number using "hundreds, tens, ones" notationpublic class NumWords 
public class NumWords {
	public static void main(String args[]) {
        // Read a non-negative integer (up to three digits) from the command line.
	    int num = Integer.parseInt(args[0]);

		// Extract place values using integer arithmetic (division/modulo).
		int hundreds = num/100;
		int tens =  (num/10)%10;
		int ones = num%10;

		// Print exactly in the required format (with comma and period).
		System.out.println(hundreds+" hundreds, "+tens+" tens, and "+ ones+" ones.");
	}
}

