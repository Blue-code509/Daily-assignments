import java.util.Arrays;

public class ElementRatio {
    public static void main(String[] args) {
        int[] a = {1, 1, 0, -1, -1};
        
        long positiveCount = Arrays.stream(a).filter(x -> x > 0).count();
        long negativeCount = Arrays.stream(a).filter(x -> x < 0).count();
        long zeroCount = Arrays.stream(a).filter(x -> x == 0).count();
        
        long totalCount = a.length;
        
        System.out.println("Positive ratio: " + (double) positiveCount / totalCount);
        System.out.println("Negative ratio: " + (double) negativeCount / totalCount);
        System.out.println("Zero ratio: " + (double) zeroCount / totalCount);
    }
}

