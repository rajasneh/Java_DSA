package Recursion;
public class Sum_of_n {
    public static int calcsum(int n){
        if(n==1){
            return 1;
        }
        int snm1=calcsum(n-1);
        int sn=n+snm1;
        return sn;
    }
    public static void main(String srgs[]){
        int n=5;
        System.out.print(calcsum(n));
    }
}
