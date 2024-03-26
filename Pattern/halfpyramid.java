package Pattern;
import java.util.*;
public class halfpyramid {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of line of pyramid");
int n=sc.nextInt();
for(int line=1;line<=n;line++){
    for(int j=1;j<=line;j++){
        System.out.print(j);
    }
       System.out.println();
}
sc.close();

    }
}
