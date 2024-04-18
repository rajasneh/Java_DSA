package Stacks;
import java.util.*;
public class valid_parentheses {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // Check if there are any remaining unmatched brackets
    }

    public static void main(String args[]) {
        valid_parentheses validator = new valid_parentheses();
        String testString = "({})[]";
        System.out.println(validator.isValid(testString)); // Output should be true
    }
}
