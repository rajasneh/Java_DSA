package Recursion;
public class Friends_Paring {
    public static int Pairing(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1=Pairing(n-1);
        int fnm2=Pairing(n-2);
        int pairup=(n-1)*fnm2;
        int totalways=fnm1+pairup;
        return totalways;

    }
    public static void main(String args[]){
        System.out.print(Pairing(3));
    }
}
