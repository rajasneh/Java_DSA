package Greedy_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Indians_Coins {
    public static void main(String args[]){
        Integer Coins[]={1,2,5,10,20,50,100,500,2000};
        int ammount=590;
        Arrays.sort(Coins , Comparator.reverseOrder());

        int CountOFcoins=0;
        ArrayList<Integer> ans= new ArrayList<>();

        for(int i =0;i<Coins.length;i++){
            while (Coins[i]<=ammount) {
                CountOFcoins++;
                ans.add(Coins[i]);
                ammount=ammount-Coins[i];
            }
        }
        System.out.println("Total (Min) coin used "+CountOFcoins);
        System.out.println("Coins used are "+ans);
    }
}
