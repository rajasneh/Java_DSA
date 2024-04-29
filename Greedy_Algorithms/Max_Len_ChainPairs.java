package Greedy_Algorithms;
import java.util.*;
public class Max_Len_ChainPairs {
    public static void main(String argsp[]){
        int pair[][]={{5,24}, {39,60}, {5,38},{27,40},{50,90}};

        Arrays.sort(pair,Comparator.comparingDouble(o -> o[1]));

        int chainLen=1;
        int chainEND=pair[0][1];//last selected pair end

        for(int i=1;i<pair.length;i++){
            if(chainEND<pair[i][0]){
                chainLen++;
                chainEND=pair[i][1];
            }
        }
        System.out.print("Maximum length of chain is "+chainLen);
    }
}
