package Trie;

public class Startwith_Prefix {
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
    public static boolean startwith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if (curr.Children[idx]==null) {
                return false;
            }
            curr=curr.Children[idx];
        }
        return true;
    }
    public static void main(String args[]){
        String word[]={"apple","app","mango","man","woman"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        System.out.println(startwith("moon"));
    }
}
