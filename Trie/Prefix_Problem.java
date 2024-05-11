package Trie;

public class Prefix_Problem {
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
    public static void prefix(Node root,String ans){
        if (root==null) {
            return;
        }
        if (root.frequency==1) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.Children.length;i++){
            if (root.Children[i]!=null) {
                prefix(root.Children[i],ans+(char)('a'+i));
            }
        }
    }
    public static void main(String args[]){
        String word[]={"zebra","dog","duck","dove"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        root.frequency=-1;
        prefix(root, "");
    }
}
