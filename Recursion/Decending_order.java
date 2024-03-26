package Recursion;
public class Decending_order {
    public static void decendin(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        decendin(n-1);
    }
    public static void main(String args[]){
        decendin(7);
    }     
}

