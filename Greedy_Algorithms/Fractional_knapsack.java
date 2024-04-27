package Greedy_Algorithms;
import java.util.*;
public class Fractional_knapsack {
    public static void main(String args[]){
        int weight[]={10,20,30};
        int val[]={60,100,120};
        int w = 50;

        double ratio[][]=new double[val.length][2];
        //0th col=>original index ; 1stcol=>ratio of weight and value;
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        //now tha ratio is sorted in ascending order but we want bigger ratio so we will traverse opposite
        
        int finalVal=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                capacity-=weight[idx];
                finalVal=finalVal+val[idx];
            }else{
                //include fractional item
                finalVal+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("Final Value is "+finalVal);
    }
}
