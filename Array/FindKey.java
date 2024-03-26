package Array;
import java.util.*;
public class FindKey {
    public static int findkey(int numbers[],int key){
         int start=0;int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
               
                end=mid-1;
                }
            }
            return -1;
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n[]={1,2,3,4,5,6,7,8,9,65,86,35,86,67};
        int key;
        System.out.print("Enter Key");
        key=sc.nextInt();
        System.out.print("key is "+findkey(n,key));
        sc.close();
       }
    }

        
    

