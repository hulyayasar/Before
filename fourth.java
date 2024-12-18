import java.util.HashMap;
import java.util.Map;

public class fourth {

    public static String func(String[] roads, String[] roads2, int[] cars){

        Map<String, Integer> roadColl = new HashMap<>();
        Map<String, Integer> roadCars  = new HashMap<>();

        int maxColl = 0;
        String maxCollRoad = "";
        int numberOfCars = 0;

        for(int i=0; i<roads.length; i++){
            roadColl.put(roads[i], roadColl.getOrDefault(roads[i], 0) + 1);
            roadCars.put(roads[i], roadCars.getOrDefault(roads[i], 0 )+ cars[i]);

            int coll = roadColl.get(roads[i]);

            if(maxColl< coll ){
                maxColl = coll;
                maxCollRoad = roads[i];
                numberOfCars = roadCars.get(roads[i]);
            }
        }

        for(int i=0; i<roads.length; i++){
            roadColl.put(roads[i], roadColl.getOrDefault(roads[i], 0) + 1);
            roadCars.put(roads[i], roadCars.getOrDefault(roads[i], 0 )+ cars[i+roads.length ]);

            int coll = roadColl.get(roads[i]);

            if(maxColl< coll ){
                maxColl = coll;
                maxCollRoad = roads[i];
                numberOfCars = roadCars.get(roads[i]);
            }
        }


        String result = "maxColl: " + maxColl +"\nmaxCollRoad" + maxCollRoad + "\nnumberOfCars: " + numberOfCars;

        return result;   
    }

    
}
