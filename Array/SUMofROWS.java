package _2D_ARRAY;

public class SUMofROWS {
    public static int sumofrowss(int matrix[][],int numberofrows){
        int sum=0;
        
            for(int j=0;j<matrix[0].length;j++){
                sum=sum+matrix[numberofrows][j];   
        }
        return sum;
    }
    public static void main(String[] args){
        int matrix[][]= {{1,4,9},{11,4,3},{2,2,3}};
        int number=1;
       int result=sumofrowss(matrix, number);
       System.out.println("sum of row is: " + result);
    }
}

