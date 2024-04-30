package Greedy_Algorithms;

public class Kth_largest_oddNo_inA_Range {
    public static int KthLArgestOdd(int k,int L,int R){
        for(int i=R;i>=L;i--){
            if(i%2!=0){
                k--;
            }
            if(k==0){
                return i;
            }
        }
        return -1; // no odd no found in the range
    }
    public static void main(String args[]){
        System.out.println("Kth odd number is = "+KthLArgestOdd(2,1,10));
    }
}
