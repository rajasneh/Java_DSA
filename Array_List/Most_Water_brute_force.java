package Array_List;
import java.util.*;
public class Most_Water_brute_force {
    public static int storewater(ArrayList<Integer> height){
        int max=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int weidth=j-i;
                int currwater=ht*weidth;
                max=Math.max(max, currwater);
            }
        }
        return max;
    }
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>(); 
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        System.out.print(storewater(arr));  
}
}
