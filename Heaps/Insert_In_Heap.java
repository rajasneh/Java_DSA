package Heaps;
import java.util.*;
public class Insert_In_Heap {
    static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();

        public void add(int data){
            arr.add(data);// add at last index

            int Childidx=arr.size()-1;
            int Parentidx=(Childidx-1)/2;

            while (arr.get(Childidx)<arr.get(Parentidx)) {
                int temp=arr.get(Childidx);
                arr.set(Childidx, arr.get(Parentidx));
                arr.set(Parentidx, temp);
            }
        }
    }
    public  static void main(String args[]){

    }
}
