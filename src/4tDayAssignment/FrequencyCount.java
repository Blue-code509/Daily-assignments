import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyCount {
    public static void main(String[] args) {
        // Input list containing numbers
        List<Integer> arr = Arrays.asList(1, 1, 3, 2, 1);

        // Step 1: Find the maximum value in the list
        // This helps determine the range of numbers to check for frequency
        int max = arr.stream().max(Integer::compare).orElse(0);

        // Step 2: Create a list to store frequency counts
        // We iterate from 0 to max (inclusive) and count occurrences of each number
        List<Integer> result = IntStream.rangeClosed(0, max) // Generate numbers from 0 to max
                .map(i -> Collections.frequency(arr, i))  // Count occurrences of 'i' in the list
                .boxed() // Convert IntStream to Stream<Integer>
                .collect(Collectors.toList()); // Collect results into a list

        // Step 3: Print the frequency count list
        System.out.println(result);
    }
}
