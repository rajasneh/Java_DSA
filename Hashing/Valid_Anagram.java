package Hashing;
import java.util.*;
public class Valid_Anagram {
    public static boolean isAnagram(String s,String t){
        if (s.length()!=t.length()) {
            return false;
        }
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if (hm.get(ch)!=null) {
                if (hm.get(ch)==1) {
                    hm.remove(ch);
                }else{
                    hm.put(ch, hm.getOrDefault(ch, 0)+1);
                }
            }else{
                return false;
            }
        }
        return hm.isEmpty();
    }
    public static void main(String args[]){
        String s="race";
        String t="care";
        System.out.println(isAnagram(s, t));
    }
}
