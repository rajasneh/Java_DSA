package LOOPS;
import java.util.*;
public class solidrhombuspattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int space=n-1;
int star=n;
int numofline=1;
while(numofline<=n){
    for(int i=0;i<space;i++){
        System.out.print("  ");
    }
    for(int j=0;j<star;j++){
        System.out.print("* ");
    
    }
    space--;
    System.out.println();
    numofline++;
}
sc.close();
    }
}
