package BinarySearch_Tree;

import java.util.*;

public class Merge_2_BSTs{
    static class node{
        int data;
        node left;
        node right;

        public node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void Inorder(node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
         Inorder(root.left,arr);
         arr.add(root.data);
         Inorder(root.right,arr);
    }
    public static node buildBalanced(ArrayList<Integer>arr,int st,int end){
        if (st>end) {
            return null;
        }
        int mid=(st+end)/2;
        node root=new node(arr.get(mid));
        root.left=buildBalanced(arr, st, mid-1);
        root.right=buildBalanced(arr, mid+1, end);
        
        return root;
    }
    public static node MergeBST(node root1,node root2){
        ArrayList<Integer>sorted1=new ArrayList<>();
        Inorder(root1, sorted1);
        ArrayList<Integer>sorted2=new ArrayList<>();
        Inorder(root2, sorted2);

        int i=0,j=0;
        ArrayList<Integer>FinalArr=new ArrayList<>();
        while (i<sorted1.size() && j<sorted2.size()) {
            if (sorted1.get(i)<=sorted2.get(j)) {
                FinalArr.add(sorted1.get(i));
                i++;
            }else{
                FinalArr.add(sorted2.get(j));
                j++;
            }
        }
        while (i<sorted1.size()) {
            FinalArr.add(sorted1.get(i));
                i++;
        }
        while (j<sorted2.size()) {
            FinalArr.add(sorted2.get(j));
                j++;
        }

        return buildBalanced(FinalArr, 0, FinalArr.size()-1);
    }
    public static void Preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void main(String args[]){
        node root1=new node(2);
        root1.left=new node(1);
        root1.right=new node(4);

        node root2=new node(9);
        root2.left=new node(3);
        root2.right=new node(12);

        node root=MergeBST(root1, root2);
        Preorder(root);
    }
}
