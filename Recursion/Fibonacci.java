package Recursion;

public class Fibonacci {
    public static int calcfin(int n){
        if(n==0||n==1){
            return n;
        }
        int fibnm1=calcfin(n-1);
        int fibnm2=calcfin(n-2);
        int fibn=fibnm1+fibnm2;
        return fibn;
    }
    public static void main(String args[]){
        int n=3;
        System.out.print(calcfin(n));
    }
}
