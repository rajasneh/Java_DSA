package Binary_Tree;

public class Min_dist_btwn_2_node {
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
    public static int LcaDist(node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int LeftDist=LcaDist(root.left, n);
        int RightDist=LcaDist(root.right, n);

        if(LeftDist==-1 && RightDist==-1){
            return -1;
        }
        else if(LeftDist==-1){
            return RightDist+1;
        }
        else{
            return LeftDist+1;
        }
    }
    public static int minDist(node root,int n1,int n2){
        node Lca=LCA2(root, n1, n2);
        int Dist1=LcaDist(Lca, n1);
        int Dist2=LcaDist(Lca, n2);

        return Dist1+Dist2;
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
        System.out.println(minDist(root, 04, 7));
    }    
}
