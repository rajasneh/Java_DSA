package BinarySearch_Tree;

public class Max_Sum_node {
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
        }
    }
    public static boolean isValidBST(node root,node min,node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data <= min.data){
            return false;
        }
        else if (max!=null && root.data>=max.data) {
            return false;
        }
         
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    public static int maxSUM(node root) {
        if (root == null) {
            return 0;
        }
        // Reset maxsum for each function call
        maxsum = 0;
        // Call the helper function to calculate maxsum for valid BST subtree
        computeMaxSum(root);
        return maxsum;
    }
    static int maxsum=0;
    // Helper function to compute maximum sum for valid BST subtrees
    public static void computeMaxSum(node root) {
        if (root == null) {
            return;
        }
        // Recursively compute maximum sum for left and right subtrees
        computeMaxSum(root.left);
        computeMaxSum(root.right);

        // Check if the current subtree is a valid BST
        if (isValidBST(root, null, null)) {
            int sum = root.data;
            if (root.left != null) {
                sum += root.left.data;
            }
            if (root.right != null) {
                sum += root.right.data;
            }
            maxsum = Math.max(maxsum, sum);
        }
    }
        public static void main(String[] args) {
        /*
                   1
                  / \
                 4   3
                / \ / \
               2  4 2  5
        */
        node root = new node(1);
        root.left = new node(4);
        root.right = new node(3);
        root.left.left = new node(2);
        root.left.right = new node(4);
        root.right.left = new node(2);
        root.right.right = new node(5);

        System.out.println(maxSUM(root));
    }
}