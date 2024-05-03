package Binary_Tree;
import java.util.*;
public class Top_View_Of_Tree {
    public static class node{
        int data;
        node left;
        node right;

        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        node Node;
        int HorizDist; //Horizontal Distance

        public Info(node Node,int HorizDist){
            this.HorizDist=HorizDist;
            this.Node=Node;
        }
    }

    public static void TopView(node root){
        //Level Order Traversal
        Queue<Info>q=new LinkedList<>();
        HashMap<Integer,node> map=new HashMap<>();
        int max=0,min=0;

        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
            if(!map.containsKey(curr.HorizDist)){  //First time horizontal dist is occurring
                map.put(curr.HorizDist,curr.Node);
            }
            if(curr.Node.left!=null){
                q.add(new Info(curr.Node.left, curr.HorizDist-1));
               min= Math.min(curr.HorizDist-1, min);
            }
            if(curr.Node.right!=null){
                q.add(new Info(curr.Node.right,curr.HorizDist+1));
                max=Math.max(max, curr.HorizDist+1);
            }
        }
    }
        for(int i=min;i<=max;i++){
            System.out.print(map.get(i).data+" ");
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

        node subRoot=new node(2);
        subRoot.left= new node(4);
        subRoot.right =new node(5);
        TopView(root);
    }    
} 
