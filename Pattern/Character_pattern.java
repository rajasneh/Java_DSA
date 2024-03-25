package Java_DSA.Pattern;

import java.util.Scanner;

public class Character_pattern {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;
char ch='A';
System.out.print("Enter the line number to print character pattern:");
n=sc.nextInt();
for(int line=1;line<=n;line++){
    for(int chars=1;chars<=line;chars++){
        System.out.print(ch);
        ch++;
    }
    System.out.println();
}
sc.close();
    }
}
