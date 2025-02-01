// Import required Java packages
import java.time.LocalTime; // Used for handling time
import java.time.format.DateTimeFormatter; // Used for formatting and parsing time
import java.util.Scanner; // Used to take input from the user

// Define the class for time conversion
public class TimeConversion {

    // Constructor (not necessary in this case)
    public TimeConversion() {
    }

    // Main method - execution starts here
    public static void main(String[] var0) {
        // Create a Scanner object to take input from the user
        Scanner var1 = new Scanner(System.in);

        // Prompt the user to enter the time in 12-hour format
        System.out.print("Enter time in 12-hour format (hh:mm:ssAM/PM): ");

        // Read the input time as a string
        String var2 = var1.next();

        // Define a formatter for parsing the input 12-hour format (hh:mm:ssAM/PM)
        DateTimeFormatter var3 = DateTimeFormatter.ofPattern("hh:mm:ssa");

        // Define a formatter for converting the time into 24-hour format (HH:mm:ss)
        DateTimeFormatter var4 = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Parse the input string into a LocalTime object using the 12-hour format
        LocalTime var5 = LocalTime.parse(var2, var3);

        // Convert and format the LocalTime object into a 24-hour format string
        String var6 = var5.format(var4);

        // Print the converted time in 24-hour format
        System.out.println("Converted time in 24-hour format: " + var6);

        // Close the scanner to prevent resource leaks
        var1.close();
    }
}
