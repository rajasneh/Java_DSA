package Recursion;

public class _03_count_length {
    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return 1+length(str.substring(1));
    }

    public static void main(String[] args) {
        String testString = "Hello, world!";
        System.out.println("Length of the string: " + length(testString));
    }
}
