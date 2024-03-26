package Backtracking;

public class On_Arrays {
    public static void changeArr(int arr[],int i,int value){
         if(i==arr.length){
            printArr(arr);
            return;
         }
         arr[i]=value;
         changeArr(arr, i+1, value+1);//Function Call
         arr[i]=arr[i]-2;//Backtracking
    }
         public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
