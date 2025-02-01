// Import required Java package
import java.util.*; // Importing all utility classes (not necessary in this case)

// Define the class
public class StringFormatExample {
    
    // Main method - execution starts here
    public static void main(String[] args) {
        
        // Declare and initialize a string variable for name
        String name = "Ayushman";
        
        // Declare and initialize an integer variable for age
        int age = 24;
        
        // Declare and initialize a double variable for score
        double score = 95.75;

        // Format the string using String.format()
        // %s - for strings, %d - for integers, %.2f - for floating-point numbers with 2 decimal places
        String formattedString = String.format("Name: %s, Age: %d, Score: %.2f", name, age, score);

        // Print the formatted string
        System.out.println(formattedString);
    }
}


