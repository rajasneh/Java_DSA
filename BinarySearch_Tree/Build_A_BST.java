package BinarySearch_Tree;
public class Build_A_BST{
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

    public static void Inorder(node root){
        if(root==null){
            return;
        }
         Inorder(root.left);
         System.out.print(root.data+" ");
         Inorder(root.right);
    }
    public static void main(String args[]){
        int val[]={5,1,3,4,2,7};
        node root=null;

        for(int i=0;i<val.length;i++){
            root=Insert(root, val[i]);
        }
        Inorder(root);
    }
}