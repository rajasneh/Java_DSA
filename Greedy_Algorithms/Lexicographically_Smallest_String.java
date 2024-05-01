package Greedy_Algorithms;

public class Lexicographically_Smallest_String {
    public static String SmallestString(int n,int k){
        StringBuilder sb = new StringBuilder();

        int totalChar=n;
        int currsum=k;

        while (totalChar>0) {
            //if it is possible to fill 'a'
            if((totalChar-1)*26>=currsum-1){
                sb.append('a');
                totalChar--;
                currsum--;
            }else{
                int position=currsum%26;
                if(position==0){
                    sb.append('z');
                    totalChar--;
                    currsum-=26;
                }else{
                    sb.append((char)(position+'a'-1));
                    totalChar--;
                    currsum-=position;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        int n=5;
        int k=101;
        System.out.println(SmallestString(n, k));
    }
}
