package Stacks;
import java.util.*;
public class Rev_String_using_Stack {
    public static String Reverse(String str){
        int idx=0;
        Stack<Character> s=new Stack<>();
        while (idx<str.length()) {
            s.push(str.charAt(idx));//storing it in a stack
            idx++;
        }
        StringBuilder result=new StringBuilder();
        while (!s.isEmpty()) {
            char curr=s.pop();
            result.append(curr);//reversing
        }
        return result.toString();
    }
    public static void main(String args[]){
        String str="jarhensa";
        System.out.println(Reverse(str));
    }
}
