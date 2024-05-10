package Hashing;
import java.util.*;
public class Iteration_On_HashSet {
    public static void main(String args[]){
        HashSet<String>set=new HashSet<>();
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Jamtara");
        set.add("Bengaluru");

        Iterator i=set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
