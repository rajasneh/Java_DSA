package Greedy_Algorithms;
import java.util.*;
public class Activity_Selection {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};//End time basis sorted
        
        int maxAct = 0;
        ArrayList<Integer> ans= new ArrayList<>();
         maxAct=1;
         ans.add(0);
         int lastend=end[0];

         for(int i=1;i<end.length;i++){
            if (start[i]>=lastend) {
                //select activity
                maxAct++;
                ans.add(i);
                lastend=end[i];
            }
         }
         System.out.println("max activity = "+maxAct);
         for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
         }
         System.out.println();
    }
}
//What is Greey Algorithm?

/*It is the problem solving technique where we make the locally optium 
choices at each stage  and  hope to achieve a global optium*/