package Basic_Sorting_Algorithm;

public class bubblesorting {
    public static void bubbleshort(int number[]){
        int n=number.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(number[j]>number[j+1]){
                    int temp=number[j];
                    number[j]=number[j+1];
                   number[j+1]=temp;
                }
            }
        }
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
    }
    public  static void main(String args[]){
        int number[]={2,9,3,5,3,4,1};
       bubbleshort(number);

    }
}
