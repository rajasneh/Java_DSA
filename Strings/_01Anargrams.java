package Strings;

public class _01Anargrams {
    public static boolean checkanargram(String str1,String str2){
        int [] f1=new int[26];
        for(int index=0;index<str1.length();index++){
            char ch=str1.charAt(index);
            f1[ch-'a']++;
        }
        int[] f2=new int[26];
        for(int index=0;index<str2.length();index++){
            char ch=str2.charAt(index);
            f2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(f1[i]!=f2[i]){
                System.out.print("It is not an anargrams");
                return false;
            }
        }
        System.out.print("It is anargrams");
        return true;
}
    public static void main(String args[]){
    String str1="asneh";
    String str2="hnesa";
   checkanargram(str1, str2);
}
}
