package Array_List;
import java.util.ArrayList;
public class Swap_Value {
    public static void swap(ArrayList<Integer> arr,int idx1,int idx2){
        int temp=arr.get(idx2);
        arr.set(idx2, arr.get(idx1));
        arr.set(idx1, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>(); 
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        swap(arr, 0, 3);
        System.out.print(arr);
       
}
}
