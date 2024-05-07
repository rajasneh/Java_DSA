package BinarySearch_Tree;
import java.util.*;
public class RangeSum {
    static class node{
        int data;
        node left;
        node right;

        public node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static int rangesum(node root,int L,int R){
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.data >= L && root.data <= R) {
            sum += root.data;
        }
        if (root.data > L) {
            sum += rangesum(root.left, L, R);
        }
        if (root.data < R) {
            sum += rangesum(root.right, L, R);
        }
        return sum;
    }
    public static void main(String args[]){
         node root = new node(8);
        root.left = new node(5);
        root.right = new node(11);
        root.right.right = new node(20);
        root.right.right.left = new node(3);

        System.out.print(rangesum(root, 5, 11));
    }
}
