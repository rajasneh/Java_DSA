package STRING;

import java.util.Arrays;

public class _02Anargrams {
    public static void main (String[] args){
        String str1="asneh";
        String str2="nseh";
      char ch[]=str1.toCharArray();
      char ch2[]= str2.toCharArray();
      Arrays.sort(ch);
      Arrays.sort(ch2);
      boolean result=Arrays.equals(ch,ch2);
      if (result){
        System.out.println(str1+" and "+str2+" are anagrams of eachother");
      }
      else{
        System.out.println(str1+" and "+str2+" are not anagrams of eachother");
      }
}
}