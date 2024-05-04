package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Delete_Leaf_Node {
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
    public static node DeleteLeaf(node root,int x){
        if(root==null){
            return null;
        }
        root.right=DeleteLeaf(root.right, x);
        root.left=DeleteLeaf(root.left, x);
        if(root.data==x&&root.left==null&&root.right==null){
           return null;
        }
        
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
                      10
                     /  \
                   3    10
                  / \     \
                  1   3    3

        */
         node root = new node(10);
        root.left = new node(3);
        root.right = new node(10);
        root.left.left = new node(3);
        root.left.right = new node(1);
        root.right.right = new node(3);
        root.right.right.left = new node(3);
        root.right.right.right = new node(3);

         DeleteLeaf(root, 3);
        LevelOrder(root);
    }    
}
