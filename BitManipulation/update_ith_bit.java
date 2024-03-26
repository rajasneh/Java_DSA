package BitManipulation;

public class update_ith_bit {
    public static int updateithbit(int n,int i,int newbit){
        int bitmask=newbit<<i;
        return n|bitmask;
    }
    public static void main(String args[]){
        System.out.print(updateithbit(10,2,4));
        

    }
}
