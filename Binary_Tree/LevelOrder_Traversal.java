package Binary_Tree;
import java.util.*;
public class LevelOrder_Traversal {
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            node NewNode=new node(nodes[idx]);
            NewNode.left=BuildTree(nodes);
            NewNode.right=BuildTree(nodes);

            return NewNode;
        }
        //LevelOrder Traversal
        // it is BREADTH FIRST SEARCH or  BFS
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
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        node root=tree.BuildTree(nodes);
        tree.LevelOrder(root);
    }
}
