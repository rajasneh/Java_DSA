package Array;

public class _02stairCASEsorting {
    public static boolean staircase(int matrix[][],int key){
        int cloumn=0;
        int row=matrix[0].length-1;
        while (row>=0&&cloumn<matrix.length-1) {
            if(key==matrix[row][cloumn]){
                System.out.println("Key Found at"+"("+row+","+cloumn+")");
                return true;
            }
            else if(key<matrix[row][cloumn]){
                row--;
            }
            else{
                cloumn++;
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
        int key=35;
    System.out.println(staircase(matrix,key));
    }
}
