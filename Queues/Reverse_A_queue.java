package Queues;
import java.util.*;
public class Reverse_A_queue {
    public static void reverse(Queue <Integer> q){
        Stack <Integer> temp = new Stack<>();
        if(q.isEmpty()){
            System.out.println("queue is empty");
        }
        while (!q.isEmpty()) {
            temp.push(q.remove());
        }
        while (!temp.isEmpty()) {
            q.add(temp.pop());
        }
    }
    public static void main(String args[]){
        Queue <Integer>q =new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverse(q);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
