package BinarySearch_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Mirror_A_BST {
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
    public static node LevelOrder(node root){
        if(root==null){
            return null;
        }
        Queue<node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            node curr=q.remove();
            if(curr==null){
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data);
                if (curr.left!=null) {
                    q.add(curr.left);
                }
                if (curr.right!=null) {
                    q.add(curr.right);
                }
            }
        }
        return root;
    }
    public static node MirrorTree(node root){
        if (root==null) {
            return null;
        }
        node temp=root.left;
        root.left=MirrorTree(root.right);
        root.right=MirrorTree(temp);


        return root;
    }
    public static void main(String args[]){
        int val[]={8,5,10,3,6,11};
        node root=null;

        for(int i=0;i<val.length;i++){
            root=Insert(root, val[i]);
        }
        LevelOrder(root);
        System.out.println();
        MirrorTree(root);
        LevelOrder(root);
    }
}
