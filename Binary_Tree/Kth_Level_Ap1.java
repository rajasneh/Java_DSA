package Binary_Tree;

public class Kth_Level_Ap1 {
    static class node{
        int data;
        node right;
        node left;

        public node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
        public static void Klevel(node root,int level,int k){
            if(root==null){
                return;
            }
            if(level==k){
                System.out.print(root.data+" ");
                return;
            }
            Klevel(root.left, level+1, k);
            Klevel(root.right, level+1, k);
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
        node.Klevel(root,1,3);
    }    
}
