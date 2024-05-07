package BinarySearch_Tree;

public class Kth_Smallest_Element {
    static class node {
        int data;
        node left, right;

        public node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    static int count=0;
    public static int KthSmallest(node root,int k){
        if (root==null) {
            return -1;
        }
        int left=KthSmallest(root.left, k);
        if (left!=-1) {
            return left;
        }
        
        count++;
        if (count==k) {
            return root.data;
        }
        

        return KthSmallest(root.right, k);
    }
    public static void main(String[] args) {
        /*
                   5
                  / \
                 3   6
                / \   \
               2   4   7
        */
        node root = new node(5);
        root.left = new node(3);
        root.right = new node(6);
        root.left.left = new node(2);
        root.left.right = new node(4);
        root.right.right = new node(7);

        int k = 3;
        System.out.println("The " + k + "th smallest element is: " + KthSmallest(root, k));

    }
}
