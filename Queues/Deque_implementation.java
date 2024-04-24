package Queues;
import java.util.*;
public class Deque_implementation {
    public static void main(String args[]){
        //double ended queue
        Deque <Integer> dq= new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println("first lement is "+ dq.getFirst());
        System.out.println("last element is "+ dq.getLast());
    }
}
