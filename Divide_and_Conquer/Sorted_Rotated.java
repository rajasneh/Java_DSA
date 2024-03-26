package Divide_and_Conquer;

public class Sorted_Rotated {
    public static int search(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid]){//line 1
           if(arr[si]<=target&&target<=arr[mid]){
            return search(arr, target, si, mid-1);
           }
        else{
            return search(arr, target, mid+1, ei);
        }
    }
        else{    
        if(arr[mid]<=target&&target<=arr[ei]){
           return search(arr, target, mid+1, ei);
        }
        else{
          return  search(arr, target, si, mid-1);
        }
    }
}
public static void main(String args[]){
    int arr[]={1,2,3,4,5,9,6,7,8};
    System.out.print(search(arr, 9, 0, arr.length-1));
}
}
