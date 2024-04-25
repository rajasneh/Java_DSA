package Queues;
import java.util.*;
public class Generate_Binary_Number {
    public static ArrayList<String> GenerateBinary(int n){
        Queue <String> q= new LinkedList<>();
        ArrayList<String> ans= new ArrayList<>();
        q.add("1");
        while (n-->0) {
            String s = q.peek();
            ans.add(s);
            q.add(s+"0");
            q.add(s+"1");
            q.remove();
        }
        return ans;
    }
    public static void main(String args[]){
        int n=5;
        System.out.print(GenerateBinary(n));
    }
}
