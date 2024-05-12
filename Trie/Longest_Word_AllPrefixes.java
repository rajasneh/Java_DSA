package Trie;

public class Longest_Word_AllPrefixes {
    static class Node{
        Node Children[]=new Node[26];
        boolean EoW;//end of word

        public Node(){
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
        curr.EoW=true;
    }


    public static String ans="";
    public static void LongestWord(Node root,StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if (root.Children[i]!=null && root.Children[i].EoW==true) {
                char ch=(char)(i+'a');
                temp.append(ch);
                if (temp.length()>ans.length()) {
                    ans=temp.toString();
                }

                LongestWord(root.Children[i], temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String args[]){
        String word[]={"a","banana","app","appl","ap","apply","apple"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }

        LongestWord(root, new StringBuilder());
        System.out.println(ans);
    }
}
