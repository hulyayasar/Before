import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class second {

    /*
     * Question 2: Intersection with Most Collisions
You are given a list of road names where each road corresponds to a collision at that intersection. 
Your task is to determine which intersection (road) has the most collisions. 
If multiple intersections have the same number of collisions, return the intersection that comes first alphabetically.

roads = [
    "Main Street", 
    "Broadway", 
    "Main Street", 
    "1st Avenue", 
    "Broadway", 
    "Main Street"
]
     */

     public static String intersection(String[] roads, int[] cars){

        Map<String, Integer> roadsAndColliosions = new HashMap<>();
        Map<String, Integer> roadsAndCars = new HashMap<>();

        int maxCollision = 0; 
        String maxCollisionRoad = "";
        int numberOfCars = 0;
        
        for (int i = 0; i< roads.length; i++) {

         roadsAndColliosions.put(roads[i], roadsAndColliosions.getOrDefault(roads[i], 0) + 1);
         roadsAndCars.put(roads[i], roadsAndCars.getOrDefault(roads[i], 0) + cars[i] );

         int coll = roadsAndColliosions.get(roads[i]) ;

            if(maxCollision< coll ||
                (coll == maxCollision && 
                    (maxCollisionRoad == null || roads[i].compareTo(maxCollisionRoad) < 0))
            ){

                maxCollision = coll;
                maxCollisionRoad = roads[i];
                numberOfCars = coll;
            }           
        }
        return "Road name is: " +  maxCollisionRoad + " and number of collision " + maxCollision + " and number of cars " +  numberOfCars;

     }

     public static void main(String[] args) {
        String[] roads = {
    "Main Street", 
    "Broadway", 
    "Main Street", 
    "1st Avenue", 
    "Broadway",
    "Main Street", 
    "Broadway"
    };
    int[] cars = {2, 3, 4, 1, 2, 5, 7};

        System.out.println(intersection(roads, cars));

        
     }
    
    
}
