package Binary_Tree;

public class Lwst_cmn_Ancestor_Ap2 {
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
    public static node LCA2(node root,int n1,int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        node LeftLca=LCA2(root.left, n1, n2);
        node RightLca=LCA2(root.right, n1, n2);
        if(LeftLca==null){
            return RightLca;
        }
        if(RightLca==null){
            return LeftLca;
        }
        return root;
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
        System.out.println(LCA2(root,4 , 7).data);
    }    
}
