package Array;

public class _01_maxSubArraySum {
    public static void subarray(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end =j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=number[k];
                    System.out.print(number[k]);
                }     
                System.out.println();
                if(currsum>maxsum){
                    maxsum=currsum;
                }
        }   
        System.out.println();
    }
    System.out.print("max sum is"+maxsum);
}
public static void main(String args[]){
    int number[]={2,4,6,8,10};
    subarray(number);
    }
}
