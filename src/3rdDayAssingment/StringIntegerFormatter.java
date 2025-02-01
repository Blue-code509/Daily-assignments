public class StringIntegerFormatter {
    public static String formatOutput(String str, int num1, int num2) {
        String concatenatedString = str.toLowerCase().replaceAll("[,\\s]", ""); // Remove spaces and commas
        int sum = num1 + num2; // Sum the two integers
        return concatenatedString + ", " + sum;
    }

    public static void main(String[] args) {
        System.out.println(formatOutput("Hello, Ayushman", 201, 1)); // Output: helloayushman, 202

    }
}