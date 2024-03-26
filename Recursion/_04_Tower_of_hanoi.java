package Recursion;
public class _04_Tower_of_hanoi {
    public static void toh(int n, int A, int C, int B){ // move n disks from A to C 1) toh(n-1,A,B,C);
        if(n==0){
            return;
        }
        toh( n-1, A, B, C);
    System.out.println("Moving " + n + "th disk from" + A + "to" + C);
    toh (n-1, B, C, A);
    }
    public static void main(String args[]){
        toh(3, 1, 3, 2);
    }

}
