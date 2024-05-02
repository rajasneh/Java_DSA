package Binary_Tree;

public class Subtree_OF_another_tree {
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

        //Check if the data of root and subroot of tree and subtree are same or not if same then check if it is identical or not
        public static boolean isSubtree(node root,node subroot){
            if(root==null){
                return false;
            }
            if(subroot==null){
                return false;
            }
            if(root.data==subroot.data){
                if(isIdentical(root,subroot)){
                    return true;
                }
            }
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }

        // check if is identical or not 

        public static boolean isIdentical(node root,node subroot){
            if(root==null && subroot==null ){
                return true;
            }else if(root==null || subroot==null ||root.data!=subroot.data ){
                return false;
            }
            if(!isIdentical(root.left, subroot.left)){
                return false;
            }
            if (!isIdentical(root.right, subroot.right)) {
                return false;
            }
            return true;
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

        node subRoot=new node(2);
        subRoot.left= new node(4);
        subRoot.right =new node(5);
        System.out.println(node.isSubtree(root,subRoot));
    }    
}
