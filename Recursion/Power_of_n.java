package Recursion;

public class Power_of_n {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
    public static void main(String args[]){
        System.out.print(power(2, 3));
    }
}
