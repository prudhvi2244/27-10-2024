package p1.p2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlacementInfo {

    Map<String,Float> placementDetailsMap=new HashMap<String,Float>();

    public void addCollegeRatingDetails(String collegeName, float rating){
        placementDetailsMap.put(collegeName,rating);
    }

    public float findCollegeRating(String collegeName){
        return placementDetailsMap.getOrDefault(collegeName,-1f);
    }

    public List<String> findCollegesWithHighestRating(){
     List<String> highestRatedColleges=new ArrayList<>();
     for(Map.Entry<String,Float> entry : placementDetailsMap.entrySet()){
         if(entry.getValue() > 4){
             highestRatedColleges.add(entry.getKey());
         }
     }
     return highestRatedColleges;
    }
}
