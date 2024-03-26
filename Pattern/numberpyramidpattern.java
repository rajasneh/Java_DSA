package Pattern;
import java.util.*;
public class numberpyramidpattern {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int space=n-1;
    int i;
  
   for(int numofline=1;numofline<=n;numofline++){
for(i=0;i<space;i++){
     System.out.print("  ");
}
    for(int j=1;j<=i; j++){
        System.out.print(i);
        
    }
    System.out.println();
   space--;
}
sc.close();
   }
    
}
