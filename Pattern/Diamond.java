package Pattern;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numofline=1;
        int space=n-1;
        int star=1;
        while(numofline<=2*n-1){
for(int i=0;i<space;i++){
    System.out.print("  ");
}
for(int j=0;j<star;j++){
System.out.print("* ");
}
for(int i=0;i<space;i++){
    System.out.print("  ");
}
if(numofline>=n){
    space=space+1;
    star=star-2;
}
else if(numofline<n){
    space=space-1;
    star=star+2;
}
System.out.println();
numofline++;
        }
        sc.close();
    }
}
