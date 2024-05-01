package Binary_Tree;

public class Build_Tree_Preorder {
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
    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        node root=tree.BuildTree(nodes);
        System.out.println(root.data);
    }
}
