package Divide_and_Conquer;

public class Quick_Sort {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void QuickSorting(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotIndex=partition(arr,si,ei);
        QuickSorting(arr, si, pivotIndex-1);
        QuickSorting(arr, pivotIndex+1, ei);
    }
    public static int partition(int arr[],int si,int ei){
        int i=si-1;
        int pivot=arr[ei];
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
             i++;
             int temp=arr[i];
             arr[i]=arr[ei];
             arr[ei]=temp;
             return i;
    }
    public static void main(String args[]){
        int arr[]={5,4,2,1,0,9,3};
        QuickSorting(arr,0,arr.length-1);
        printarr(arr);

    }
}
