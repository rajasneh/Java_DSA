package Queues;
import java.util.*;
public class cnct_N_ropes_min_cost {
    public static int ConnectRopes(int arr[]){
        PriorityQueue <Integer> q = new PriorityQueue<>();
        int totalCost=0;
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
        }

        while (q.size()>1) {
            int firstmin=q.poll();//takes minimum cost
            int secondmin=q.poll();
            totalCost=totalCost+firstmin+secondmin;//add cost of 2 ropes in queue as next time it will also be added to some ropes
            q.add(firstmin+secondmin);//we are not adding totalcost because we will add sum of current two min ropes only not the total
        }
        return totalCost;
    }
    public static void main(String args[]){
        int len[] = { 4, 3, 2, 6 };
        System.out.print(ConnectRopes(len)+"  ");
    }
}
