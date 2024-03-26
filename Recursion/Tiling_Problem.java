package Recursion;

public class Tiling_Problem {
    public static int PlaceTiles(int n){//input breadth
        //BASE
        if(n==0||n==1){
            return 1;
        }
        //vertical
        int fnm1=PlaceTiles(n-1);
        //horizontal
        int fnm2=PlaceTiles(n-2);
        int total=fnm1+fnm2;
        return total;
    }
    public static void main(String args[]){
        System.out.print(PlaceTiles(3));
    }
}
