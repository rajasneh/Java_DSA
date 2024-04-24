package Queues;
import java.util.*;
public class Interleave_two_halves {
    public static void interleave(Queue <Integer> q){
        int size=q.size();
        Queue <Integer> firsthalf=new LinkedList<>();
        // even length is given
        //add half of element in a diffrent queue 
        for(int i=0;i<size/2;i++){
            firsthalf.add(q.remove());
        }

        //now we add one element from firsthalf queue and one from itself 

        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}
