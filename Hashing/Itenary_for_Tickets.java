package Hashing;

import java.util.*;

public class Itenary_for_Tickets {
    
    // Method to find the starting point of the itinerary
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();
        
        // Reverse the map to find the destination-to-source mapping
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        // Find the starting point (a key that is not a destination)
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // Starting point
            }
        }
        return null; // In case no start point is found
    }

    public static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("Chennai", "Bengaluru");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi", "Goa");

        // Find the starting point of the itinerary
        String start = getStart(ticket);
        System.out.print(start);

        // Trace the itinerary
        while (start != null && ticket.containsKey(start)) {
            String destination = ticket.get(start);
            System.out.print("-->" + destination);
            start = destination; // Move to the next destination
        }
        System.out.println();
    }
}
