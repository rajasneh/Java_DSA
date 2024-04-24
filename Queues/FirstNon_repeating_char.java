package Queues;
import java.util.*;
public class FirstNon_repeating_char {
    public static void printNonRepeating(String str){
        Queue <Character> q=new LinkedList<>();
        int frequency[]= new int[26];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            frequency[ch-'a']++;

            while(!q.isEmpty()&&frequency[q.peek()-'a']>1){
                q.remove();
            }

            if(q.isEmpty()){
                System.out.println(-1+" ");
            }else{
                System.out.println(q.peek());
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        String str="aabccxb";
        printNonRepeating(str);
    }
}
