package Recursion;
public class First_occurrence {
    public static int FirstOccurrence(int arr[],int key,int i){
        if(arr[i]==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurrence(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,7,4,5,93,6,7,8,9,54,5,65,3};
        int key=3;
        System.out.print(FirstOccurrence(arr,key,0));
    }
}
