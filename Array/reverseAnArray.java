package Array_or_Methods;

public class reverseAnArray {
    public static void revarr(int number[]){
        int start=0,end=number.length-1;
        while(start<end){
            int temp=number[end];
          number[end]=number[start];
          number[start]=temp;

            start++;
            end--;
        }
       
          
    }
        public static void main(String[] args){
            int n[]={1,2,3,4,5,6,7,8,9};
            revarr(n);
            for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
            }
        }
}
