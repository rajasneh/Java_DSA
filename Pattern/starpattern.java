package Pattern;
import java.util.*;
public class starpattern {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.print("Enter the number of line to print pattern");
   n =sc.nextInt();
for(int line=1;line<=n;line++){
for(int j=1;j<=line;j++){
    System.out.print("*"); 
}
System.out.println();
}

sc.close();
}
}
