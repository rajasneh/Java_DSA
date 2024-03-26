package Backtracking;

public class Find_Permutation {
    public static void Find(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
        }
        for(int i=0;i<str.length();i++){
            char current=str.charAt(i);
            
            //now we will remove the i from str bcz we already added it now it will ask choice from other
            //by "abcdefg"="abc"+"efg"....hence d is removed

            String Newstr=str.substring(0, i)/*this will not include i*/+str.substring(i+1);
            //writing nothing automatically taken as end 
            //substring mean part of a string

            Find(Newstr, ans+current);//new str because str.length mai change aa rhi hai loop nhi chlegi 
        }
    }
    public static void main(String args[]){
        String str="abc";
        String ans="";
        Find(str, ans);
    }
}
