package Backtracking;
public class _03_knights_Tours{
    public static void knight(int i,int j,int n,int matrix[][],int move){
        if(i<0||j<0||i>=n||j>=n){
            return;
        }
        if(matrix[i][j]!=0){
            return;
        }
        matrix[i][j]=move;
        if(move==n*n-1){
            for(int x=0;x<n;x++){
                for(int y=0;y<n;y++){
                    System.out.print(matrix[x][y]+" ");
                }
                System.out.println();
            }
            return;
        }
            knight(i + 2, j + 1, n, matrix, move + 1);
            knight(i + 1, j + 2, n, matrix, move + 1);
            knight(i - 1, j + 2, n, matrix, move + 1);
            knight(i - 2, j + 1, n, matrix, move + 1);
            knight(i - 2, j - 1, n, matrix, move + 1);
            knight(i - 1, j - 2, n, matrix, move + 1);
            knight(i + 1, j - 2, n, matrix, move + 1);
            knight(i + 2, j - 1, n, matrix, move + 1);
            matrix[i][j]=0;
        }
    
    public static void main(String[] args) {
        int n = 8; // Board size
        int[][] matrix = new int[n][n]; // Initialize the matrix with all -1s (unvisited)

        // Start the knight's tour from position (0, 0) with move 0
        knight(0, 0, n, matrix, 0);
    }

}