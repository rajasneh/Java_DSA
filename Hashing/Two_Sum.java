package Hashing;
import java.util.*;
public class Two_Sum {
    public static int[] getindex(int arr[],int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement),i};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[] {-1,-1};
    }   
    public static void main(String args[]){
        int arr[]={2, 7, 11, 1};
        int target=9;
        int[] indices = getindex(arr, target);
        System.out.println(indices[0] + " " + indices[1]);
    }
}

