package BitManipulation;

public class odd_OR_even {
    public static void Findoddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("It is a even number");
        }
        else{
            System.out.println("It is a odd number");
        }
    }
    public static void main(String args[]){
        Findoddoreven(3);
        Findoddoreven(5);
        Findoddoreven(10);
    }
}
