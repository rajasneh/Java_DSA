package Java_DSA.Pattern;

import java.util.Scanner;

public class ButterFly {
    public class butterflypattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
int n;
System.out.print("Enter the value of n");
n=sc.nextInt();
 int space=2*n-2;
int star=1;
int numofline=1;
   while(numofline<=2*n){
    for(int j=0;j<star;j++){
    System.out.print("* ");
    }
    for(int i=0;i<space;i++){
        System.out.print("  ");
    }
    for(int j=0;j<star;j++){
    System.out.print("* ");
    }
    if(numofline<n){
star++;
space=space-2;
    }
    else if(numofline>=n){
        star--;
        space=space+2;
    }
 
  System.out.println();

numofline++;
   }
    sc.close();
    }
}
}
