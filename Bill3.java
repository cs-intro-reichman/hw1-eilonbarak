// This program splits a restaurant bill evenly among three people.
public class Bill3 {
	public static void main(String[] args) {
         // The main method is the entry point of the program.
        // It receives 4 arguments from the command line:
       // 3 names and the total bill amount.
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];

         // Convert the total bill amount (String) into a double number.
		double price = Double.parseDouble(args[3]);

		// Divide the total bill by 3 and round up to the nearest whole number.
		double Fprice = Math.ceil(price/3);
		
		 // Print the message in reverse order of names (3 → 2 → 1)
        // and display the amount each person should pay.
		 System.out.println("Dear "+name3+", "+name2+", and "+name1+": pay "+ Fprice + " Shekels each.");
	}
}
