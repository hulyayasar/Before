import java.util.HashMap;
import java.util.Map;

public class third {

    public static String mostCollission(String[] roads, int[] cars){

        Map<String, Integer> roadCollision = new HashMap<>();
        Map<String, Integer> roadCars = new HashMap<>();

        int maxColl = 0;
        String maxCollRoad = "";
        int numberOfCars = 0;

        for(int i=0; i<roads.length; i++){
            roadCollision.put(roads[i], roadCollision.getOrDefault(roads[i], 0)  + 1 );
            roadCars.put(roads[i], roadCars.getOrDefault(roads[i], 0) + cars[i]);

            int coll = roadCollision.get(roads[i]);
            int car = roadCars.get(roads[i]);

            if(coll> maxColl){
                maxColl = coll;
                maxCollRoad = roads[i];
                numberOfCars = car;
            }
        }

        String result = "Road: " + maxCollRoad + "\ncollision times: " + maxColl + "\nnumber of cars on the road: " + numberOfCars;

        return result;
 
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

        System.out.println(mostCollission(roads, cars));
}
    
}
