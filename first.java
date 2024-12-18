import java.util.HashMap;
import java.util.Map;

public class first {

    /*
     * You are given a list of lists, where each inner list contains a family name in the format {FirstName, LastName}. 
     * Your task is to find the full name (case-insensitive) that appears most frequently in the list. 
     * If there is a tie, return the name that comes first alphabetically.
     * names = {
    {"Tom", "Johnson"}, 
    {"John", "Smith"}, 
    {"Sam", "Smith"}, 
    {"john", "smith"}, 
    {"Sam", "smith"}, 
    {"sam", "Smith"}
}

     */

     public static String function(String[][] names){
        Map<String, Integer>  map = new HashMap<>();

        for (String[] name : names) {
            String fullName = (name[0] + " " + name[1]).toLowerCase();
            map.put(fullName, map.getOrDefault(fullName, 0) + 1);  
        }

        int maxFrq = 0;
        String mostFrqFullName = "";

        for (Map.Entry<String, Integer> e: map.entrySet() ) {

            if(e.getValue()> maxFrq){
                maxFrq = e.getValue();
                mostFrqFullName = e.getKey();
            }      
        }

        return mostFrqFullName;
     }

     public static String function_2(String[][] names){
        Map<String, Integer>  map = new HashMap<>();
        int maxFrq = 0;
        String mostFrqFullName = "";

        for (String[] name : names) {
            String fullName = (name[0] + " " + name[1]).toLowerCase();
            map.put(fullName, map.getOrDefault(fullName, 0) + 1);  
            if(maxFrq < map.get(fullName)){
                maxFrq = map.get(fullName);
                mostFrqFullName = fullName;
            }
        }
        // for (Map.Entry<String, Integer> e: map.entrySet() ) {

        //     if(e.getValue()> maxFrq){
        //         maxFrq = e.getValue();
        //         mostFrqFullName = e.getKey();
        //     }      
        // }

        return mostFrqFullName;
     }




     public static void main(String[] args) {
        //String[][] names = {{"John", "Smith"}, {"Sam", "Smith"}, {"Tom", "Johnson"}, {"Michael", "Smith"}, {"Sam", "Johnson"}}; 

        String[][] names = {
    {"Tom", "Johnson"}, 
    {"John", "Smith"}, 
    {"Sam", "Smith"}, 
    {"john", "smith"}, 
    {"Sam", "smith"}, 
    {"sam", "Smith"}
    };

        System.out.println(function_2(names));

        
     }
    
}