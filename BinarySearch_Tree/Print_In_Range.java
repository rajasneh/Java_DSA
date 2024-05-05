package BinarySearch_Tree;

public class Print_In_Range {
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
    public static void PrintInRange(node root,int k1,int k2){
        if(root==null){
            return;
        }
        if (root.data>=k1 && root.data<=k2) {
            PrintInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            PrintInRange(root.right, k1, k2);
        }
        else if (root.data<k1) {
            PrintInRange(root.left, k1, k2);
        }else{
            PrintInRange(root.right, k1, k2);
        }
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
        PrintInRange(root, 5, 12);
    }
}
