package Array_List;

import java.util.ArrayList;

public class Pair_Sum {
    public static boolean findtarget(ArrayList<Integer>arr,int target){
        int lp=0;
        int rp=arr.size()-1;
        while (lp!=rp) {
            if(arr.get(lp)+arr.get(rp)==target){
                return true;
            }
            else if(arr.get(lp)+arr.get(rp)>target){
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>(); 
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        System.out.print(findtarget(arr,3));  
    }
}
