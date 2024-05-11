package Trie;

public class Search {
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
    public static boolean SearchKey(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.Children[idx]==null){
                return false;
            }
            curr=curr.Children[idx];
        }
        return curr.EndOfChildren==true;
    }
    public static void main(String args[]){
        String word[]={"the","a","there","thier","any","the"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        System.out.println(SearchKey("there"));
    }
}
