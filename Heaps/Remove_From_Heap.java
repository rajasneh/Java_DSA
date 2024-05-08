package Heaps;

import java.util.ArrayList;

public class Remove_From_Heap {
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
                
                Childidx=Parentidx;
                Parentidx=(Childidx-1)/2;
            }
        }
        public  int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;

            if (left<arr.size() && arr.get(left)<arr.get(minidx)) {
                    minidx=left;
            }
            if (right<arr.size() && arr.get(right)<arr.get(minidx)) {
                minidx=right;
            }

            if (minidx!=i) {//if we have to fix the heap
                int temp=arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);

                heapify(minidx);
            }
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

        public  int remove(){//remove fn removes the minimum ie index 0
            int data=arr.get(0);

            //step1 swap first and last
            int temp=arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // step2 delete last
            arr.remove(arr.size()-1);
            
            //step3 heapify the heap or fix it

            heapify(0);

            return data;
        }
    }
     public static void main(String args[]){
            Heap h=new Heap();
            h.add(3);
            h.add(4);
            h.add(1);
            h.add(7);

            while (!h.isEmpty()) {
                System.out.println(h.peek());
                h.remove();
             }     
     }
}
