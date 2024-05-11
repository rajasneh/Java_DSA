package Trie;

public class WordBreak {
    static class Node{
        Node[] Children=new Node[26];
        boolean EndOfChildren;

        Node(){
            for(int i=0;i<26;i++){
                Children[i]=null;
            }
        }
    }
    public static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if (curr.Children[idx]==null) {
                curr.Children[idx]=new Node();
            }
            curr=curr.Children[idx];
        }
        curr.EndOfChildren=true;
    }
    public static boolean Search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if (curr.Children[idx]==null) {
                return false;
            }
            curr=curr.Children[idx];
        }
        return curr.EndOfChildren==true;
    }


    public static boolean wordbreak(String key){
        if (key.length()==0) {
            return true;
        }
        for(int i=1;i<=key.length();i++){
        if(Search(key.substring(0, i))&&wordbreak(key.substring(i))){
            return true;
        }
        }
        return false;
    }
    public static void main(String args[]){
        String word[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        System.out.println(wordbreak("ilikesung"));
    }
}
