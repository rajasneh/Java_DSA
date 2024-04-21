package Stacks;
import java.util.*;
public class Simplify_path {
    public static void SimplifyPath(String str){
        Stack<String> s = new Stack<>();
        String[] p = str.split("/");
        StringBuilder output = new StringBuilder("/");

        for (String component : p) {
            if (!s.isEmpty() && component.equals("..")) {
                s.pop();
            } else if (component.equals(".") || component.equals("")) {
                continue;
            } else {
                s.push(component);
            }
        }

        Stack<String> revStack = new Stack<>();
        while (!s.isEmpty()) {
            revStack.push(s.pop());
        }

        while (!revStack.isEmpty()) {
            output.append(revStack.pop());
            if (!revStack.isEmpty()) {
                output.append("/");
            }
        }
        System.out.print(output);
    }
    public static void main(String args[]){
        String str="/apnacollege/../";
        SimplifyPath(str);
    }
}
