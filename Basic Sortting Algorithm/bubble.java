package Sorting;

public class bubble {
    public static void bubblesort(int number[]){
        for(int i=0;i<number.length-1;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i]>number[j]){
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
    }
    public static void main(String[] args){
        int number[]={3,6,2,1,8,7,4,5,3,1};
       bubblesort(number);
    }
}

