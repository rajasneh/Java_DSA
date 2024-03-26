package Recursion;

public class Remove_Duplicates_in_string {
    public static void RemoveDuplicates(int idx,String str,StringBuilder newstr,boolean map[]){
        //Base Case
        //GOOGLE,MICROSOFT
        if(idx==str.length()){
            System.out.print(newstr);
            return;
        }
        //work
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            RemoveDuplicates(idx+1, str, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            RemoveDuplicates(idx, str, newstr.append(currchar), map);
        }
    }
    public static void main(String args[]){
        String str="asnehraj";
        RemoveDuplicates(1, str, new StringBuilder(""),new boolean[26]);
    }
}
