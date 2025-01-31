public class StringTransform {
    public static void main(String[] args) {
        String s = "aabbbcccaa";
        System.out.println(transformString(s));
    }
    public static String transformString(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        result.append(s.charAt(s.length() - 1)).append(count);
        
        return result.toString();
    }
}
