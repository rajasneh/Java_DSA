package Recursion;

public class _01_key_place {
    public static void Find(int key,int arr[],int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
           System.out.print(i+" ");
        }
        //kaam
        Find(key, arr, i+1);
    }
    public static void main(String args[]){
        int arr[]={1,0,0,0,3};
        Find(3, arr, 0);
    }
}
