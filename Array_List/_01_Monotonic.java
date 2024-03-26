package Array_List;

import java.util.*;

public class _01_Monotonic {
    public static boolean Monotonic(ArrayList<Integer>arrlist){
        boolean inc=true;
        boolean dec=true;
            for(int i=0;i<arrlist.size()-1;i++) {
                if(arrlist.get(i) >arrlist.get(i+1)){
                inc=false;
                }
                if(arrlist.get(i) <arrlist.get(i+1)){
                    dec=false;
                }
            }
        
        return inc||dec;
    }
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<>(); 
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.print(Monotonic(arr));  
}
}