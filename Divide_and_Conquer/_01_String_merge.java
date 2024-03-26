package Divide_and_Conquer;

import java.util.Arrays;

public class _01_String_merge {
    public static void sort(String arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        sort(arr, si, mid);
        sort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si,int mid,int ei){
        int i=si;
        int j=mid+1;
        int k=0;//pointer of resultant res
        String res[]=new String[ei-si+1];
        while(i<=mid&&j<=ei){
            if(arr[i].compareTo(arr[j])<=0){
                res[k]=arr[i];
                k++;
                i++;
            }
            else{
                res[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            res[k]=arr[i];
                k++;
                i++;
        }
        while(j<=ei){
            res[k]=arr[j];
            k++;
            j++;
        }
        for(int idx=0;idx<res.length;idx++){
            arr[idx+si]=res[idx];
        }
    }
    public static void main(String[] args){
        String arr[]={"sun", "earth", "mars", "mercury"};
        sort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
}
