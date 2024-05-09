package Hashing;
import java.util.*;
public class HashMap_Operation {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();

        //insert
        map.put("India", 50);
        map.put("China", 200);
        map.put("Nepal", 20);

        System.out.println(map);

        //get
        int population=map.get("India");
        System.out.println(population);

        //Contains key:- it will check if the key exist or not returns true or false

        System.out.println(map.containsKey("SriLanka"));

        //remove
        map.remove("China");
        System.out.println(map);

        //size
        System.out.println(map.size());

        //isEmpty
        System.out.println(map.isEmpty());

        //clear it delete all data

        map.clear();;
        System.out.println(map);

    }
}
