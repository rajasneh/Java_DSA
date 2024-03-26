package LOOPS;

import java.util.Scanner;

public class hollowrhombus {
    public static void main(String [] args){
          Scanner sc=new Scanner(System.in);

          int n=sc.nextInt();
          int space=n-1;
          int star=n;
          int numofline=1;
          while(numofline<=n){
           
              for(int i=0;i<space;i++){
                  System.out.print("  ");
              }
             if(numofline==1||numofline==n){
                for(int i=0;i<star;i++){
                    System.out.print("* ");
                }
             }
             else{
                System.out.print("* ");
                for(int j=0;j<n-2;j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
           space--;
           System.out.println();
           numofline++;
          
         }
            sc.close();
            }
          

    }
