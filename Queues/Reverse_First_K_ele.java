package Queues;
import java.util.*;
public class Reverse_First_K_ele {
    public static void reverseK(int k,Queue <Integer> q){
        Stack <Integer>temp = new Stack<>();
        for(int i =0;i<k;i++){
            temp.push(q.remove());
        }
        while (!temp.isEmpty()) {
            q.add(temp.pop());
        }
        for(int i=0;i<k;i++){
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
        Queue <Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        reverseK(5, q);
        while (!q.isEmpty()) {
            System.out.println(q.remove()+" ");
        }
    }
}
