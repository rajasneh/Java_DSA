package BitManipulation;

public class GetithBit {
    public static int getbit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            System.out.println(0);
            return 0;
        }
        else{
            System.out.println(1);
            return 1;
        }
    }
    public static void main(String args[]){
        getbit(15,5 );
        

    }
}
