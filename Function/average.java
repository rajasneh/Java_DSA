package Function;
    import java.util.*;
public class average {
    public static int calcaverage(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Enter number 1");
        n1=sc.nextInt();
        System.out.print("Enter number 2");
        n2=sc.nextInt();
        System.out.print("Enter number 3");
        n3=sc.nextInt();
        System.out.print(calcaverage(n1, n2, n3));
        sc.close();
    }
}
