package Trie;

public class Unique_Substring {
    static class Node{
        Node[] Children=new Node[26];
        boolean EndOfChildren;
        int frequency;
        Node(){
            for(int i=0;i<26;i++){
                Children[i]=null;
            }
            frequency=1;
        }
    }
    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if (curr.Children[idx]==null) {
                curr.Children[idx]=new Node();
            }else{
                curr.Children[idx].frequency++;
            }
            curr=curr.Children[idx];
        }
        curr.EndOfChildren=true;
    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if (root.Children[i]!=null) {
                count+=countNodes(root.Children[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[]){
        String str="ababa";
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            insert(suffix);
        }
        System.out.print(countNodes(root));
    }
}
