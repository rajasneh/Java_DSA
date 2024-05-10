package Hashing;
import java.util.*;
public class Linkedd_HashSet {
    public static void main(String args){
        LinkedHashSet<String>cities=new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Jamtara");
        cities.add("Kolkata");

        //prints in order
        System.out.println(cities);
    }
}
