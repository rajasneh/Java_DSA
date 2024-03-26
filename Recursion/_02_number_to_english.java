package Recursion;

public class _02_number_to_english {
    static String digits[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void ConvertTOenglish(int n){
        if(n==0){
            return;
        }
        int lastdigit=n%10;
        ConvertTOenglish(n/10);
        System.out.print(digits[lastdigit]+" ");
    }
    public static void main(String args[]){
        ConvertTOenglish(500);
    }
}
