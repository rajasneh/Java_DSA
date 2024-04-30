package Greedy_Algorithms;
import java.util.*;
public class Chocola_Problem {
    public static void main(String args[]){
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costVer,Collections.reverseOrder());//shorting in descending order
        Arrays.sort(costHor,Collections.reverseOrder());

        int h=0,v=0; //pointers for tracking at which index we are
        int vp=1,hp=1; //at starting there is only 1 vertical and horizontal pieces
        int cost=0;

        while (h<costHor.length && v<costVer.length) {
            // case 1: if horizontal price is more
            if(costHor[h]>=costVer[v]){
                cost=cost+(costHor[h]*vp);
                hp++;
                h++;
            }else{
                cost=cost+(costVer[v]*hp);
                vp++;
                v++;
            }
        }
         while(h<costHor.length){
            cost=cost+(costHor[h]*vp);
            hp++;
            h++;
        }
        while (v<costVer.length) {
            cost=cost+(costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println("Min cost of cuts is = "+cost);
    }
}
