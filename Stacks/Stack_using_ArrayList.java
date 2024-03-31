package Stacks;
import java.util.*;
public class Stack_using_ArrayList {
    static class Stack{
        static ArrayList<Integer>Arr=new ArrayList<>();
        public static boolean isEmpty(){
            return Arr.size()==0;
        }
        //PUSH
        public static void push(int data){
            Arr.add(data);      //automatically add in the last int o(1) time  
        }
        //POP
        public static int pop(){//in default impletation pop returns deleted data cz of that return type is int
            int top=Arr.get(Arr.size()-1);
            Arr.remove(Arr.size()-1);
            return top;
        }
        //PEEK
        public static int peek(){
            return Arr.get(Arr.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(3);//add in top
        s.push(2);
        s.push(1);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
