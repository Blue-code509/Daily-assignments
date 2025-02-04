import java.util.*;

public class StringLengthFormatter {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>(List.of("Abcd", "cde", "useful"));

        // Sort the list by string length
        Collections.sort(input, Comparator.comparingInt(String::length));

        // Process each string to append its length
        List<String> output = new ArrayList<>();
        for (String s : input) {
            output.add(s + " (" + s.length() + ")");
        }

        // Print the result
        System.out.println(output);
    }
}

