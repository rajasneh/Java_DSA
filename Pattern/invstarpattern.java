package LOOPS;
import java.util.*;
public class invstarpattern {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;
System.out.print("Enter the number of line to print pattern");
n =sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=n;j>=i;j--){
        System.out.print("*");

    }
    System.out.println();
}
sc.close();
    }
}
