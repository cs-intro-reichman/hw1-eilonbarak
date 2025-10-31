// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	    // Parse hours and minutes from the single "hh:mm" command-line string.
        // We build a small string from the relevant characters and convert to int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		
        // Decide AM/PM

		String ampm;  
		if (hours < 12) {
			 ampm = "AM";
		}
		else{
		     ampm = "PM";
		}

		// Convert 24h -> 12h for display

		int displayHour;

        if (hours == 0) {          // 00:xx -> 0:xx
            displayHour = 0;
        } else if (hours < 12) {   // 01..11 -> 1..11
         displayHour = hours;
        } else if (hours == 12) {  // 12:xx -> 12:xx
         displayHour = 12;
        } else {                   // 13..23 -> 1..11
          displayHour = hours - 12;
        }

		// Print exactly in the required format (minutes always two digits)


  	    System.out.print(displayHour + ":");
        if (minutes < 10) {
        System.out.print("0");
        }
        System.out.println(minutes + " " + ampm);

	}
}