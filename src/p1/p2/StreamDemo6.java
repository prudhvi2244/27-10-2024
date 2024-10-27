package p1.p2;

import java.util.Random;
import java.util.stream.Stream;

public class StreamDemo6 {

    public static void main(String[] args) {

        Stream.iterate(1,i->i+2).limit(10).forEach(System.out::println);

        Stream.of(1,2,3,4,5,6,7,8,9,10).skip(8).forEach(System.out::println);

    }

}
