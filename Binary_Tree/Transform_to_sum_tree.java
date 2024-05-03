package Binary_Tree;

public class Transform_to_sum_tree {
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
    public static int transform(node root){
        if(root==null){
            return 0;
        }

        int leftChild=transform(root.left);
        int rightChild=transform(root.right);

        int data=root.data;

        int newleft=root.left == null ? 0 : root.left.data;//if root.left is not null
        int newright=root.right==null ? 0 : root.right.data;

        root.data=newleft+leftChild+newright+rightChild;
        return data;
    }
    public static void Preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void main(String args[]){
        /*
                     1
                    /  \
                   2    3
                  / \  / \
                 4   5 6  7
        */
        /*expected output
                      27
                     /   \
                    9     13  
                  /  \   /   \
                 0   0  0    0



         */
       
        node root = new node (1);
        root.left = new node (2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        root.right.right = new node(7);
        transform(root);
        Preorder(root);
    }    
}