package Binary_Tree;

public class Kth_Ancestor {
    static class node{
        int data;
        node right;
        node left;

        public node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static int KAncestor(node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int Left=KAncestor(root.left, n, k);
        int Right=KAncestor(root.right, n, k);

        if(Left==-1 &&  Right==-1){
            return -1;
        }
        int max=Math.max(Left, Right);
         
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }
    public static void main(String args[]){
        /*
                     1
                    /  \
                   2    3
                  / \  / \
                 4   5 6  7
        */
       
        node root = new node (1);
        root.left = new node (2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);

        
        KAncestor(root, 5, 2);
    }    
}
