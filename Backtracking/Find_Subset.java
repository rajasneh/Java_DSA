package Backtracking;

public class Find_Subset {
    public static void FindSUbset(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //if choice is yes
        FindSUbset(str, i+1, ans+str.charAt(i));
        //if choice is no
        FindSUbset(str, i+1, ans);
    }
    public static void main(String args[]){
        String str="abc";
        String ans="";
        FindSUbset(str, 0, ans);
    }
}
