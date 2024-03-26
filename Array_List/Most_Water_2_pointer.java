package Array_List;
import java.util.*;
public class Most_Water_2_pointer {
    public static int calculate(ArrayList<Integer> height){
        int maxheight=0;
        int lp=0;
        int n=height.size();
        int rp=n-1;
        while (lp<rp) {
            int ht=Math.min(height.get(lp), height.get(rp));
            int weidth=rp-lp;
            int currlvl=ht*weidth;
            maxheight=Math.max(maxheight, currlvl);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }   
        return maxheight;
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
        System.out.print(calculate(arr));  
}
}
