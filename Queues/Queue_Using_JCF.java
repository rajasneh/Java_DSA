package Queues;
import java.util.*;
public class Queue_Using_JCF {
    public static void main (String args[]){
        Queue <Integer> q= new LinkedList<>();//using java collection framework
        q.add(1);
        q.add(2);
        q.add(3);
    
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
    }

