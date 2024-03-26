package Strings;

public class countLOWERcase {
    public static int lowercase(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==Character.toLowerCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        String str="Asneh";
        System.out.print(lowercase(str));
    }
}
