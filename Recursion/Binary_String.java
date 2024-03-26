package Recursion;

public class Binary_String {
    public static void printBinStrings(int n, int lastPlace, String str){
//base case
if(n == 0) {
System.out.println(str);
return;
}

//kaam

printBinStrings(n-1, 0, str+"0");

if(lastPlace == 0) {
printBinStrings(n-1, 1, str+"1");
}

}
public static void main(String args[]) {
printBinStrings(3, 0, "");
}
}
