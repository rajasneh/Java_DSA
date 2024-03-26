package Pattern;
import java.util.*;
public class invstarpattern02 {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n;
System.out.print("Enter the number of lines to print pattern");
n=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=(n-i+1);j++){ //i is the no of line
System.out.print("*");
}
System.out.println();
}
sc.close();
    }
}
