package BitManipulation;

public class SET_ith_bit {
    public static int setibit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static void main(String[] args){
    System.out.print(setibit(10, 2));
    }
}
