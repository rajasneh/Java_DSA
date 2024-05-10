package Hashing;

import java.util.*;

public class Tree_Map {
     public static void main(String args[]){
        TreeMap<String,Integer> Tm=new TreeMap<>();//in Tm dobuly ll is used and we get the same order
        Tm.put("Zimmbawe", 10);
        Tm.put("India", 50);
        Tm.put("Sri lanka", 40);
        Tm.put("US", 90);

        System.out.print(Tm);
    }
}
