package Array_List;
import java.util.*;
public class Pair_Sum_2 {
    public static boolean pairsum2(ArrayList<Integer>arr,int target){
        int bp=-1;//breaking point
        int n=arr.size();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>arr.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;//left pointer
        int rp=bp;
        while (lp!=rp) {
            if(arr.get(lp)+arr.get(rp)==target){
                return true;
            }
            if(arr.get(lp)+arr.get(rp)<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
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
        System.out.print(pairsum2(arr,3));  
    }
}
