package Heaps;
import java.util.*;
public class mergeKsortedLists {
    static class node implements Comparable<node>{
        int data;
        node next;

        public node(int data){
            this.data=data;
            next=null;
        }
        @Override
        public int compareTo(node node2){
            return this.data-node2.data;
        }
    }
    public static node sortedList(node arr[],int k){
        node head = new node(0);
        node last=head;

        PriorityQueue<node>pq=new PriorityQueue<>();

        for(int i=0;i<k;i++){// add all the head of k ll in pq
            if(arr[i]!=null){
            pq.add(arr[i]);
            }
        }

        if(pq.isEmpty()){
            return null;
        }

        while (!pq.isEmpty()) {
            node curr=pq.poll();

            last.next=curr;
            last=last.next;

            if (curr.next!=null) {
                pq.add(curr.next);
            }
        }
        return head.next;
    }
    public static void main(String args[]){
        node[] a = new node[3];

        // Create three linked lists
        node ll1 = new node(1);
        ll1.next = new node(4);
        ll1.next.next = new node(5);

        node ll2 = new node(2);
        ll2.next = new node(3);
        ll2.next.next = new node(6);

        node ll3 = new node(7);
        ll3.next = new node(8);
        ll3.next.next = new node(9);

        // Store the heads of the linked lists in the array
        a[0] = ll1;
        a[1] = ll2;
        a[2] = ll3;

        node res=sortedList(a, 3);
        while (res!= null) {
            System.out.print(res.data + " ");
           res=res.next;
        }
    }
}
