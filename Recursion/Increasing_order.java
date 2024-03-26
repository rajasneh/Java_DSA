package Recursion;
 class Increasing_order {
    public static void printincr(int n){
    if(n==1){
        System.out.print(n);
        return;
    }
    System.out.print(n+" ");
    printincr(n-1);
    }
    public static void main(String args[]){
        printincr(19);
    }
}
