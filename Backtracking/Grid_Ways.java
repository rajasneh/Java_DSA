package Backtracking;

public class Grid_Ways {
    //QUESTION=Find number of ways to go from (0,0) to (n-1,m-1) in a NxM grid allowed moves=right and down
    public static int GridWays(int n,int m,int i,int j){
        if(i==n-1&&j==m-1){
            return 1;
        }else if(i==n||j==m){
            return 0;
        }
        //right move
        int way1=GridWays(n, m, i, j+1);
        //down move
        int way2=GridWays(n, m, i+1, j);
        return way1+way2;
    }
    public static void main(String args[]){
        int n=3;
        int m=3;
        System.out.print(GridWays(n, m, 0, 0));
    }
}
