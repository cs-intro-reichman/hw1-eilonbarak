// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {

		// Read the positive upper bound (lim) from the command line.
		int lim = Integer.parseInt(args[0]);

		// Draw three integers uniformly at random in [0, lim).
		int a = (int)(Math.random() * lim);
        int b = (int)(Math.random() * lim);
        int c = (int)(Math.random() * lim);


		// Sort, then get the middle value by subtracting from the sum.
		int min = Math.min(a, Math.min(b, c));

		int max = Math.max(a, Math.max(b, c));

		int mid = (a + b + c) - min - max;

		// First line: original order; second line: ascending order.
        System.out.println( a+ " "+b+" "+c);
		System.out.println( min+ " "+mid+" "+max);






		
	}
}
