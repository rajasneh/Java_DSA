package _2D_ARRAY;

public class FIND7sINmatrix {
    public static int findnumber(int matrix[][],int number){
        int start_row=0;
        int end_row=matrix.length-1;
        int start_col=0;
        int counter=0;
        int end_col=matrix[0].length-1;
        while(start_row<=end_row&&start_col<=end_col){
            //TOP
            for(int j=start_col;j<=end_col;j++){
               if(matrix[start_row][j]==number){
                counter++;
               }
            }
            for(int i=start_row+1;i<=end_row;i++){
                if(matrix[i][end_col]==number){
                    counter++;
                }
            }
            for(int j=end_col-1;j>=start_col;j--){
                if(start_row==end_row){
                    break;
            }
            if(matrix[end_row][j]==number){
                counter++;
            }
        }
            for(int i=end_row-1;i>start_row;i--){
                if(start_col==end_col){
                    break;
                }
                if(matrix[i][start_col]==number){
                    counter++;
                }
            }
            start_col++;
            start_row++;
            end_col--;
            end_row--;
          
        }
        return counter;
    }
    public static void main(String []args){
        int matrix[][]={{4,7,8},{8,8,7}};
        int result=findnumber(matrix, 8);
        System.out.println("Number of occurrences of 7: " + result);
}
}
