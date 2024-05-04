package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Invert_Binary_tree {
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
    public static node InvertTree(node root){
        if(root==null){
            return null;
        }
        node temp=root.left;
        root.left=InvertTree(root.right);
        root.right=InvertTree(temp);
        return root;
    }
    public static void LevelOrder(node root){
            if(root==null){
                return;
            }
            Queue<node> q =new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                node curr=q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data);
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                }
            }
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
        InvertTree(root);
        LevelOrder(root);
    }    
}
