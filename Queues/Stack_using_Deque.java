package Queues;
import java.util.*;
public class Stack_using_Deque {
    static class stack{
       static Deque <Integer>dq = new LinkedList<>();

        //push
        public  void push(int data){
            dq.addLast(data);
        }

        //pop
        public  int pop(){
            return dq.removeLast();
        }

        //peek

        public  int peek(){
            return dq.getLast();
        }
    }
    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek="+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
