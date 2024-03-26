package BitManipulation;

public class Power_of_2_or_not {
    public static boolean checkpowerof2(int n){
        return (n&n-1)==0;
    }
    public static void main(String[] args){
    System.out.print(checkpowerof2(7));
    }
}
