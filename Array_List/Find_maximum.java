package Array_List;
import java.util.ArrayList;
public class Find_maximum {
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>(); 
        arr.add(11);
        arr.add(2);
        arr.add(3);
        arr.add(40);
        arr.add(5);
        arr.add(9);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        System.out.println(max);
}
}
