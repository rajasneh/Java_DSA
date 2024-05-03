package Binary_Tree;

public class Check_Univalued {
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
    public static boolean isUnivalued(node root){
        if(root==null){
            return true;
        }
       if(root.left!=null && root.left.data!=root.data){
        return false;
       }
       if(root.right!=null && root.right.data!=root.data){
        return false;
       }
       boolean leftUnivalued=isUnivalued(root.left);
       boolean rightUnivalued=isUnivalued(root.right);
       if(!leftUnivalued || !rightUnivalued){
        return false;
     }

       return true;
    }
    public static void main(String args[]){
        
       
        node root = new node (2);
        root.left = new node (2);
        root.right = new node(2);
        root.left.left = new node(2);
        root.left.right = new node(6);
        root.right.left = new node(2);
        root.right.right = new node(2);
        System.out.println(isUnivalued(root));
    }    
}
