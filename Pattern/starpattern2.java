package LOOPS;

import java.util.Scanner;

public class starpattern2 {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of line to print pattern");
int n=sc.nextInt();
int sp=n-1;
int str=1;
int numofline=1;
while(numofline<=n){
    for(int i=0;i<sp;i++){
        System.out.print(" ");
    }
    for(int j=0;j<str;j++){
        System.out.print("*");
    }
    System.out.println();
    str++;
    sp--;
    numofline++;
}
sc.close();
    }
}
