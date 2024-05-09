package Heaps;

import java.util.PriorityQueue;

public class Sliding_Window {
     static class pair implements Comparable<pair>{
        int val;
        int idx;

        public pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(pair p2){
            return p2.val-this.val;
        }
    }
    public static void main(String args[]) {
        int nums[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] res=new int[nums.length-k+1];
        PriorityQueue<pair>pq =new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(new pair(nums[i],i));
        }
        res[0]=pq.peek().val;

        for(int i=k;i<nums.length;i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }
            pq.add(new pair(nums[i],i));
            res[i-k+1]=pq.peek().val;
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
