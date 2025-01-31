import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter time in 12-hour format (hh:mm:ssAM/PM): ");
        String inputTime = scanner.next();
        
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        LocalTime time = LocalTime.parse(inputTime, inputFormatter);
        String outputTime = time.format(outputFormatter);
        
        System.out.println("Converted time in 24-hour format: " + outputTime);
        
        scanner.close();
    }
}
