package Heaps;

import java.util.ArrayList;

public class peek_from_heap {
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
        public  int peek(){
            return arr.get(0);
        }
    }
    //Peek
    public  static void main(String args[]){

    }
}
