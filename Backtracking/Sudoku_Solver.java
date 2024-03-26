package Backtracking;

public class Sudoku_Solver {
    public static boolean isSafe(int Sudoku[][],int row,int col,int digit){
        //check for column
        for(int i=0;i<9;i++){
           if(Sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for(int j=0;j<9;j++){
            if(Sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int startingrow=(row/3)*3;
        int startingcol=(col/3)*3;
        for(int i=startingrow;i<startingrow+3;i++){
            for(int j=startingcol;j<startingcol+3;j++){
                if(Sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean SudokuSolver(int Sudoku[][],int row,int col){
        //Base Case
        if(row==9){
            return true;
        }
        int nextrow=row , nextcol=col+1;
        if(col+1==9){//if col is 9 and we have to move in next row
            nextrow=row+1;
            nextcol=0;
        }
        if(Sudoku[row][col]!=0){
            return SudokuSolver(Sudoku, nextrow, nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(Sudoku,row,col,digit)){//is it safe to place our digits?
                Sudoku[row][col]=digit;
                if(SudokuSolver(Sudoku, nextrow, nextcol)){
                    return true;
                }
                else{
                    Sudoku[row][col]=0;
                }
            }
        }
        return false;
    }
    public static void printsudoku(int Sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(Sudoku[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int Sudoku [][] = {{ 0, 0, 8, 0, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 0, 4, 1, 9, 0},
        {1, 8, 5, 0, 6, 0, 0, 2, 0},
        {0, 0, 0, 0, 2, 0, 0, 6, 0},
        {9, 6, 0, 4, 0,5, 3, 0, 0},
        {0, 3, 0, 0, 7, 2, 0, 0, 4},
        {0, 4, 9, 0, 3, 0, 0, 5, 7},
        {8, 2, 7, 0, 0, 9, 0, 1, 3} };
        if(SudokuSolver(Sudoku, 0, 0)){
            System.out.println("Solution exist");
            printsudoku(Sudoku);
        }
        else{
            System.out.print("Solution dosent exist");
        }
    }
}
