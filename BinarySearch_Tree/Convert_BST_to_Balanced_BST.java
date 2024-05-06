package BinarySearch_Tree;

import java.util.ArrayList;

public class Convert_BST_to_Balanced_BST {
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
        }
    }
    public static void Preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void getinorder(node root,ArrayList<Integer>inorder){
        if(root==null){
            return ;
        }
        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
    }
    public static node createBST(ArrayList<Integer>inorder,int st,int end){
        if (st>end) {
            return null;
        }
        int mid=(st+end)/2;
        node root=new node(inorder.get(mid));
        root.left=createBST(inorder, st, mid-1);
        root.right=createBST(inorder, mid+1, end);
        
        return root;
    }
    public static node BalanceBST(node root){
        ArrayList<Integer> inorder=new ArrayList<>();
        getinorder(root, inorder);

        root=createBST(inorder, 0, inorder.size()-1);
        return root;
    }
     public static void main(String args[]){
        node root = new node (8);
        root.left = new node(6);
        root.left.left = new node(5);
        root.left.left.left = new node(3);
        root.right = new node(10);
        root.right.right = new node(11);
        root.right.right.right = new node(12);

        root=BalanceBST(root);
        Preorder(root);
    }
}
