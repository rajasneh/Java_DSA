package BinarySearch_Tree;
public class Validate_BST {
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
        }
    }
    public static node Insert(node root,int val){
        if(root==null){
            root=new node(val);
            return root;
        }
        if(root.data>val){
        root.left=Insert(root.left, val);
        }else{
            root.right=Insert(root.right, val);
        }
        return root;
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
    public static void Inorder(node root){
        if (root==null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    
    public static void main(String args[]){
        int val[]={8,5,3,1,4,6,10,11,14};
        node root=null;

        for(int i=0;i<val.length;i++){
            root=Insert(root, val[i]);
        }
        Inorder(root);
        System.out.println();
        System.out.print(isValidBST(root,null,null));
    }
}
