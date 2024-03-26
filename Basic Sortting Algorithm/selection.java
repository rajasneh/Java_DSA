package Sorting;
public class selection {
    public static void selectionsort(int number[]){
        for(int i=0;i<number.length-1;i++){
           int minpos=i;
            for(int j=i+1;j<number.length;j++){
                if(number[minpos]>number[j]){
                 minpos=j;
                }
            }
            int temp=number[minpos];
            number[minpos]=number[i];
            number[i]=temp;
        }
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]);
        }
    }
    public static void main(String [] args){
        int number[]={3,6,2,1,8,7,4,5,3,1};
        selectionsort(number);
    }
}
