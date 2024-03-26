package Function;
import java.util.*;
public class multiplication {
    public static int multiply(int a,int b){
            int mul=a*b;
            return mul;
        }
        public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
            int num1,num2;
            System.out.print("Enter value of number 1 \n");
            num1=sc.nextInt();
            System.out.print("Enter value of number 2 \n");
            num2=sc.nextInt();
            int result=multiply(num1, num2);
            System.out.print("Result is "+result);
            sc.close();
    }
}