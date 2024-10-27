package p1.p2;

import java.util.Optional;
import java.util.stream.Stream;

public class Stream10 {
    public static void main(String[] args) {

       Stream<String> stream= Stream.of("Red","Green","Yellow");
       Optional<String> opt=stream.findAny();
       opt.ifPresent(System.out::println);



    }
}
