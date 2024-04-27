package Greedy_Algorithms;

import java.util.Arrays;

public class Min_Absolute_Diff {
    public static void main(String args[]){
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};

        int MinDiff=0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0;i<A.length;i++){
            MinDiff+=Math.abs(A[i]-B[i]);
        }

        System.out.println("Minimum Diffrence of pairs are : "+MinDiff);
    }
}
