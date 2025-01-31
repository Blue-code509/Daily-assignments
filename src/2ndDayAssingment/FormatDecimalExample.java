import java.text.DecimalFormat;

public class FormatDecimalExample {
    public static void main(String[] args) {
        // Step 1: Define a floating-point number (double) 
//         DecimalFormat is a Java class used to format numbers to a specific pattern.
// It helps in controlling decimal precision.
// We initialize a double variable with a number that has more than 4 decimal places.

        double number = 123.456789;

        // Step 2: Format using DecimalFormat
        // Creating an instance of DecimalFormat to format the number to 4 decimal places
        // we have to put there number in place of #### then we can find the value.
        DecimalFormat df = new DecimalFormat("#.####");

        // Step 3: Format and print the number
        //  the we are going to print the nos DecimalFormat.
        System.out.println("Formatted using DecimalFormat: " + df.format(number));

        // Step 4: Format using printf
        // %.4f ensures that the number is rounded to 4 decimal places
        // then we are using the function by the formatted to print Formatted using printf: %.4f%n
        System.out.printf("Formatted using printf: %.4f%n", number);
    }
}

