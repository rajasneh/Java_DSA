package ArrayList;
import java.util.*;
public class Lonely_Numbers {
    public static ArrayList<Integer> checklonely(ArrayList<Integer>arr){
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.size();
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
           if(i>0 && (arr.get(i-1)==arr.get(i)-1||arr.get(i-1)==arr.get(i))){
            continue;
           }
           if(i<n-1 && (arr.get(i+1)==arr.get(i)+1||arr.get(i+1)==arr.get(i))){
            continue;
           }
            ans.add(arr.get(i));
        }
        return ans;
    }

    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>(); 
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(3);
        System.out.print(checklonely(arr));  
}
    }
