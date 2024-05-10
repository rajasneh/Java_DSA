package Hashing;
import java.util.*;
public class Itenary_for_Tickets {
        public static String getStart(HashMap<String,String>tickets){
            HashMap<String,String>revMap=new HashMap<>();
            
            for(String key:tickets.keySet()){
                revMap.put(tickets.get(key),key);
            }

            for(String key:tickets.keySet()){
                if(!revMap.containsKey(key)){
                    return key;//starting poimt
                }
            }
            return null;
        }
    public static void main(String args[]){
        HashMap<String,String>ticket=new HashMap<>();
        ticket.put("Chennai","Bengaluru" );
        ticket.put("Mumbai","Delhi" );
        ticket.put("Goa","Chennai" );
        ticket.put("Delhi","Goa" );

        String start=getStart(ticket);
        System.out.print(start);
        for(String key : ticket.keySet()){
            System.out.print("-->"+ticket.get(start));
            start=ticket.get(start);
        }
        System.out.println();
    }
}
