package Stacks;
import java.util.*;
public class Collection_Framework {
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
