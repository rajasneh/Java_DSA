package Hashing;
import java.util.*;
public class Linked_Hashmap {
    public static void main(String args[]){
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();//in lhm dobuly ll is used and we get the same order

        lhm.put("India", 50);
        lhm.put("Sri lanka", 40);
        lhm.put("US", 90);

        System.out.print(lhm);
    }
}
