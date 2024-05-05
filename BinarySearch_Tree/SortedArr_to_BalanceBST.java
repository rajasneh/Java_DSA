package BinarySearch_Tree;

public class SortedArr_to_BalanceBST {
    static class node{
        int data;
        node left;
        node right;

        public node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void PreOrder(node root){
        if (root==null) {
            return ;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static node buildBalanced(int arr[],int st,int end){
        if (st>end) {
            return null;
        }
        int mid=(st+end)/2;
        node root=new node(arr[mid]);
        root.left=buildBalanced(arr, st, mid-1);
        root.right=buildBalanced(arr, mid+1, end);
        
        return root;
    }
    public static void main(String args[]){
        int arr[]={3,5,6,8,10,11,12};
        node root=buildBalanced(arr, 0, arr.length-1);
        PreOrder(root);
    }
}
