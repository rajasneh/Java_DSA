package BinarySearch_Tree;

public class Delete_A_Node {
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
    public static node Delete(node root,int val){
        if(root.data<val){
            root.right=Delete(root.right, val);
        }else if (root.data>val) {
            root.left=Delete(root.left, val);
        }
        else{
            //Case 1:Leaf Node
            if(root.left==null && root.right==null){
                return null;
            }

            //case 2: Single child
            if(root.right==null){
                return root.left;
            }
            if (root.left==null) {
                return root.right;
            }

            //case 3:both child
            node IS=FindInOrderSucessor(root.right);
            root.data=IS.data;
            root.right=Delete(root.right, IS.data);
        }
        return root;
    }
    public static node FindInOrderSucessor(node root){
        while (root.left!=null) {
            root=root.left;
        }
        return root;
    }
    public static void Inorder(node root){
        if(root==null){
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
        Delete(root,1 );
        Inorder(root);
    }
}
