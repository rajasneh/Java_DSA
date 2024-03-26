package STRING;
public class Palindrome {
    public static boolean checkPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.println("not a palindrome");
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str="race car";
        System.out.print(checkPalindrome(str));
}
}
