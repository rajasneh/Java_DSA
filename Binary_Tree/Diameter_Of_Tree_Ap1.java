package Binary_Tree;

public class Diameter_Of_Tree_Ap1 {
    static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            node NewNode=new node(nodes[idx]);
            NewNode.left=BuildTree(nodes);
            NewNode.right=BuildTree(nodes);

            return NewNode;
        }
        public static int Sum(node root){
            if(root==null){
                return 0;
            }
            int leftSum=Sum(root.left);
            int rightSum=Sum(root.right);
            return leftSum+rightSum+root.data;
        }

        public static int Height(node root){
            if(root==null){
                return 0;
            }
            int leftHeight=Height(root.left);
            int rightHeight=Height(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }

        //FiND DIAMETER OF A TREE

        public static int Diameter(node root){
            if(root==null){
                return 0;
            }
            int Lh= Height(root.left);   //left height
            int Rh=Height(root.right);   //right right

            int Ld=Diameter(root.left);    //left diameter
            int Rd=Diameter(root.right);   //right diameter

            int SelfDiameter=Lh+Rh+1;

            return Math.max(SelfDiameter, Math.max(Ld, Rd));
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
        System.out.println(BinaryTree.Diameter(root));
    }    
}

