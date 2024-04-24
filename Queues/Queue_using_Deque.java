package Queues;
import java.util.*;
public class Queue_using_Deque {
    static class queue{
        static Deque <Integer> dq = new LinkedList<>();

        //add
        public static void add(int data ){
            dq.addLast(data);
        }

        //remove
        public static int remove(){
            return dq.removeFirst();
        }

        //peek
        public static int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String args[]){
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek = "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
