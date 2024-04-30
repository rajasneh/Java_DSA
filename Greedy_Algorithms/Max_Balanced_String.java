package Greedy_Algorithms;

public class Max_Balanced_String {
    public static int maxBalancedString(String str){
        int Lcount=0;
        int Rcount=0;
        int n=str.length();
        int ans=0;

        for(int i=0;i<n;i++){
            char ch = str.charAt(i);

            if(ch=='R'){
                Rcount++;
            }else{
                Lcount++;
            }

            if(Rcount==Lcount){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        String str="LRRRRLLRLLRL";
        System.out.println("Max Balanced String = "+maxBalancedString(str));
    }
}
