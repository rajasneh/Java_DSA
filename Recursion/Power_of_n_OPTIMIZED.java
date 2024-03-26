package Recursion;
public class Power_of_n_OPTIMIZED {
    public static int POWER(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower=POWER(x, n/2);
        int halfpowersq=halfpower*halfpower;
        if(n%2!=0){
            halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String args[]){
        System.out.print(POWER(2, 10));
    }
}
