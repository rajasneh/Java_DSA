package Array;

public class _01stairCASEsorting {
    public static boolean staircase(int matrix[][],int key){
        int row=0;
        int cloumn=matrix[0].length-1;
        while (row<matrix.length&&cloumn>=0) {
            if(key==matrix[row][cloumn]){
                System.out.println("Key Found at"+"("+row+","+cloumn+")");
                return true;
            }
            else if(key<matrix[row][cloumn]){
                cloumn--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[]args){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=100;
    System.out.println(staircase(matrix,key));
    }
}
