package p1.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo5 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Red", "Green", "Blue","Red");
        list.stream().distinct().forEach(System.out::println);

    }
}
