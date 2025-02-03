import java.util.function.BiFunction;
// BiFunction is the function interface that provides the function BiFunction that can we use string and int bot in one function

public class StringIntegerFormatter {
    public static void main(String[] args) {


        // Using a lambda function to format output
        // in the below code Bifunction is<String, Integer[], String> because of it take 2 input and return one output 
       
       
        BiFunction<String , Integer[], String> formatOutput = (str, nums) -> {
            
            // Converts str to lowercase → str.toLowerCase().
            // Removes spaces and commas → replaceAll("[,\\s]", "")
            String formattedStr = str.toLowerCase().replaceAll("[,\\s]", "");
            int sum = nums[0] + nums[1];

            return formattedStr + ", " + sum;
        };

        System.out.println(formatOutput.apply("Hello, Ayushman", new Integer[]{201, 1}));
    }
}
