package Divide_and_Conquer;

public class _02_Majority_Element {
    public static int majority(int arr[]){
        int winner;
        winner=arr[0];
        int lead=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==winner){//if next is also same
                lead++;
            }else if(lead>0){//if next element is another element
                lead--;
            }
            else{//if lead is 0 and vote is yours
                winner=arr[i];
                lead=1;
            }
        }
        return winner;
    }

        public static void main(String args[]){
            int number[]={2,2,1,1,1,2,2};
            System.out.print(majority(number));
        }
    
}
