package Heaps;

import java.util.PriorityQueue;

public class Nearby_cars {
    static class point implements Comparable<point>{
        int x;
        int y;
        int distsq;
        int i;

         public point(int x,int y,int distsq,int i){
            this.x=x;
            this.y=y;
            this.distsq=distsq;
            this.i=i;
         }
         @Override
         public int compareTo(point p2){
            return this.distsq-p2.distsq;
         }
    }
    public static void main(String args[]){
        int point[][]={{3,3},{5,-1},{-2,4}};
        PriorityQueue<point>pq=new PriorityQueue<>();
        int k=2;

        for(int i=0;i<point.length;i++){
            int distsq=point[i][0]*point[i][0]+point[i][1]*point[i][1];
            pq.add(new point(point[i][0], point[i][1], distsq, i));
        }

        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().i);//printing car index
        }
    }
}
