package Trie;;

public class Insertion {
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

    public static  void insert(String word){
        Node curr=root;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if (curr.Children[idx]==null) {
                curr.Children[idx]=new Node();
            }
            curr=curr.Children[idx];
        }
        curr.EndOfChildren=true;
    }

    public static void main(String args[]){
        String word[]={"the","a","there","thier","any","the"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
    }
}
    
