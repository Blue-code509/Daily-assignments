// 1st Method>>>>



// import java.util.*;
// import java.util.stream.Collectors;

// public class StringLengthFormatter {
//     public static void main(String[] args) {
//         // Input list of strings
//         List<String> input = List.of("Abcd", "cde", "useful");

//         // Processing each string to append its length
//         List<String> output = input.stream()
//                 .sorted(Comparator.comparingInt(String::length)) // Sort by length
//                 .map(s -> s + " (" + s.length() + ")") // Append length in (length) format
//                 .collect(Collectors.toList()); // Collect results into a list

//         // Print the result
//         System.out.println(output);
//     }
// }



// 2nd method>>>

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

