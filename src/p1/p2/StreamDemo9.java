package p1.p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo9 {
    public static void main(String[] args) {


        Map<String,Double> map=new HashMap<String,Double>();
        map.put("abc",4.9);
        map.put("xyz",4.9);
        map.put("jvl",4.4);
        map.put("gpt",3.6);
        map.put("ooo",5.0);


        Double rating=map.getOrDefault("abc1",-1.0);

        System.out.println(rating);

        List<String> collegeNames=new ArrayList<>();
       map.entrySet().stream().filter(e -> e.getValue()>=4.0).forEach(e -> {
           collegeNames.add(e.getKey());
       }
       );
        System.out.println(collegeNames);


    }
}
