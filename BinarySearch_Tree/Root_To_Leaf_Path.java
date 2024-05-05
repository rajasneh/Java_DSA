package BinarySearch_Tree;
import java.util.*;
public class Root_To_Leaf_Path {
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
    public static void RootTOleaf(node root,ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.right==null && root.left==null){
            System.out.println(path);
        }
        RootTOleaf(root.left, path);
        RootTOleaf(root.right, path);
        path.remove(path.size()-1);
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
        ArrayList<Integer> path=new ArrayList<>();
       RootTOleaf(root,path);
    }
}
