package p1.p2;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo1 {

    public static void main(String[] args) {

        //Approach-1
       List<Integer> list=Arrays.asList(1,2,3,4,5);
       Stream stream1=list.stream();


       //Approach-2
       Set<Integer> set=new HashSet<>();
       set.add(1);
       set.add(2);
       set.add(31);
       set.add(4);
      Stream stream2= set.stream();


      //Approach-3
      List<Integer> list1=List.of(9,8,2,3,34);
      Stream stream3=list1.stream();

      //Approach-4
      Stream stream4=Stream.empty();

      //Approach-5
      Stream stream5=Stream.of(10,20,30,1,2,4);

      //Approach-6
      Stream<Double> stream6=Stream.generate(()->Math.random());

      //Approach-7
      Stream stream7=Stream.iterate(0,i->i+1);

      //Approach-8
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Prudhvi");
        map.put(2,"Praveen");
        map.put(3,"Kiran");
        Stream stream8=map.keySet().stream();

      // Approach-9
      Stream stream9=map.values().stream();


      //Approach-10
      Stream stream10=map.entrySet().stream();


    }

}
