// This program calculates the future value of an investment 
// based on the initial amount, interest rate, and number of years.
public class FVCalc {
	public static void main(String[] args){

        // Read command-line arguments: amount, rate (in %), and years.
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) / 100;// Convert percent to decimal
		int n = Integer.parseInt(args[2]);

		// Calculate total growth using compound interest formula: (1 + rate)^n
		double futureValue = currentValue * Math.pow(1 + rate, n); 

        // Print the result as an integer (cut decimals, no rounding)
		System.out.println("After "+n+ " years, "+currentValue+ "$ saved at "+ rate*100+ "% will yield $"+(int)futureValue);


	}

}