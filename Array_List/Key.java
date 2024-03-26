package ArrayList;
import java.util.*;

public class Key {
    public static int maxFreq(ArrayList<Integer> arr, int key) {
        int count = 0; // Variable to store the count of occurrences of the key
        
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == key) {
                count++;
            }
        }
        
        return count; // Return the count of occurrences of the key
    }
    
    public static void main(String[] args) {
        // Example usage:
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 2, 5, 2, 6));
        int key = 2;
        int maxFrequency = maxFreq(list, key);
        System.out.println("Max frequency of " + key + ": " + maxFrequency);
    }
}
