import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddEven {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(3, 0, 4, 9, 6, 0, 0, 1, 2, 0, 12, 0, 0);

        // Separate even and odd numbers
        Map<Boolean, List<Integer>> separatedNumbers = values.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNumbers = separatedNumbers.get(true);
        List<Integer> oddNumbers = separatedNumbers.get(false);

        // Print results
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
/*stream() - Converts the list into a stream.
partitioningBy(n -> n % 2 == 0) - Separates numbers into two groups:
true → Even numbers
false → Odd numbers
get(true) - Retrieves the list of even numbers.
get(false) - Retrieves the list of odd numbers. */
