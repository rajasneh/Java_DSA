package Function;
import java.util.*;

public class palindrome {
   public static int findpalindrome(int n){
    int temp=n;
    int rem,s=0;
    while(temp!=0){
        rem=temp%10;
        s=s*10+rem;
        temp=temp/10;
    }
    return s;
} 
public static void main (String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your number");
    n=sc.nextInt();
    if(findpalindrome(n)==n){
        System.out.print("Number is a palindrome number");
    }
    else{
        System.out.print("Not a palinfrome number");
    }
    sc.close();;
}
}
