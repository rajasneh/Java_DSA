package BinarySearch_Tree;

public class Size_of_Largest_BST_inBT {
    static class node{
        int data;
        node left;
        node right;

        public node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    static class Info{
        boolean isBST;
        int max;
        int min;
        int size;

        public Info(boolean isBST,int max,int min,int size){
            this.isBST=isBST;
            this.max=max;
            this.min=min;
            this.size=size;
        }
    }
    public static int maxBST=0;

    public static Info LargestBST(node root){
        if(root==null){
            return new Info(true,Integer.MIN_VALUE,Integer.MAX_VALUE,0);
        }
        Info LeftInfo=LargestBST(root.left);
        Info rightInfo=LargestBST(root.right);
        int size=LeftInfo.size+rightInfo.size+1;
        int min=Math.min(root.data,Math.min(LeftInfo.min, rightInfo.min));
        int max=Math.max(root.data,Math.max(LeftInfo.max,rightInfo.max));

        if(root.data<=LeftInfo.max || root.data>=rightInfo.min ){
            return new Info(false, max, min, size);
        }

        if (LeftInfo.isBST && rightInfo.isBST) {
            maxBST=Math.max(maxBST, size);
            return new Info(true, max, min, size);
        }

        return new Info(false, max, min, size);
    }
    public static void main(String args[]){
        node root = new node( 50);
        root.left = new node (30);
        root.left.left = new node (5);
        root.left.right = new node (20);

        root.right = new node (60);
        root.right.left = new node (45);
        root.right.right = new node (70);
        root.right.right.left = new node(65);
        root.right.right.right = new node(80);

        Info info=LargestBST(root);
        System.out.println("Largest BST size is "+maxBST);
    }
}
