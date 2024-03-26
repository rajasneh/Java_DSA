package Backtracking;
public class _01_Rat_in_a_maze {
    public static void FindWays(int matrix[][],int i,int j,int n,boolean chckVisited[][],String path){
        // Base case: if the rat goes out of bounds, return
        if(i<0||j<0||i>=n||j>=n){
            return;
        }
        // Base case: if the rat reaches the destination, print the path and return
         if(i==n-1&&j==n-1){
            System.out.println("Destination Reached the path is  "+path);
            return;
        }
        // Base case: if the current cell is blocked or already visited, return
        if(matrix[i][j]==0||chckVisited[i][j]){
            return;
        }
        // Mark the current cell as visited
        chckVisited[i][j]=true;
         
        // Explore all four directions from the current cell recursively
        FindWays(matrix, i-1, j, n, chckVisited, path+"U");//up
        FindWays(matrix, i+1, j, n, chckVisited, path+"D");//down
        FindWays(matrix, i, j-1, n, chckVisited, path+"R");//right
        FindWays(matrix, i, j+1, n, chckVisited, path+"L");//left

        // Mark the current cell as unvisited (backtrack)
        chckVisited[i][j]=false;
        }
        public static void main(String args[]){
            int maze[][]={ { 1, 1,1,1},
                           { 0, 1, 0, 1 },
                           {1,1,1,1 },
                           { 1, 0, 1, 1 } };
            int n=maze.length;
            String path="";
            boolean checkvisited[][]=new boolean[n][n];
            FindWays(maze, 0, 0, n, checkvisited,path);
        }
    }
