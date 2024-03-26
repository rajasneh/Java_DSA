package LOOPS;
import java.util.*;
public class hollowrectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the number of stars in a rectangle");
        n=sc.nextInt();
        int space=n-2;
        int star=n;
    int numofline=1;
        while(numofline<=n-1){
        if(numofline==1||numofline==n-1){
            for(int i=0;i<star;i++){
         System.out.print("* ");   
            }
        }else{
            System.out.print("* ");
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            System.out.print("* ");
        }
            System.out.println();
            numofline++;
        
        
    }
sc.close();
    }
}
