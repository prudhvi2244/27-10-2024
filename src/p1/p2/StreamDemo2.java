package p1.p2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {


      List<Integer> list=  Arrays.asList(1,2,3,4,5);
   /*   Stream<Integer> stream=list.stream();
        Stream stream1=stream.filter(i->i%2==0);
        stream1.forEach((t)->System.out.println(t));*/

        list.stream().filter(i->i%2!=0).forEach(System.out::println);


    }

}
