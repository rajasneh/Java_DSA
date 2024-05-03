package Binary_Tree;
import java.util.*;
public class Lwst_cmn_Ancestor_Ap1 {
    static class node{
        int data;
        node right;
        node left;

        public node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }

        public static boolean getpath(node root,int n,ArrayList<node>path){
            if(root==null){
                return false;
            }
            path.add(root);
            if(root.data==n){
                return true;
            }

            boolean FoundLeft=getpath(root.left, n, path);
            boolean FoundRight=getpath(root.right, n, path);

            if(FoundLeft || FoundRight){
                return true;
            }

            path.remove(path.size()-1);
            return false;
        }
        public static node LCA(node root,int n1,int n2){
            ArrayList<node> path1=new ArrayList<>();
            ArrayList<node> path2=new ArrayList<>();

            getpath(root,n1,path1);
            getpath(root,n2,path2);

            int i=0;
            for(;i<path1.size()&&i<path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }
            //last equal node is at i-1

            node Lca=path1.get(i-1);

            return Lca;
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
        System.out.println(node.LCA(root, 04, 8).data);
    }    
}
