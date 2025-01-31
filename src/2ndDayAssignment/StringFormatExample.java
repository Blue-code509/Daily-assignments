// package 2ndDayAssignment;
import java.util.*;

public class StringFormatExample {
    public static void main(String[] args) {
        String name = "Ayushman";
        int age = 24;
        double score = 95.75;

        String formattedString = String.format("Name: %s, Age: %d, Score: %.2f", name, age, score);

        System.out.println(formattedString);
    }
}

