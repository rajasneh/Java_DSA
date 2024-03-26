package Function;
import java.util.*;
public class  sumofdigits {
    public static int calsumofdigits(int n){
        int rem,sum=0;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.print("Enter a number");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<10){
            System.out.print(n);
        }
        else{
            System.out.print(calsumofdigits(n));
        }
        sc.close();

    }
}
