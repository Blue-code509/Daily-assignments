import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "care";
        String s2 = "race";

        boolean isAnagram = checkAnagram(s1, s2);

        if (isAnagram) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }

    public static boolean checkAnagram(String s1, String s2) {
        // Convert strings to lowercase and remove spaces (optional)
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not the same, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert to character arrays and sort
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
