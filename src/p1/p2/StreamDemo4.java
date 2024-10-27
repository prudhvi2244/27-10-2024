package p1.p2;

import java.util.Arrays;
import java.util.List;

public class StreamDemo4 {
    public static void main(String[] args) {

        List<Integer> list=  Arrays.asList(1,3,2,5,4);

        System.out.println("Sorting in Ascending order of numbers");
        list.stream().sorted().forEach(System.out::println);

        System.out.println("Sorting in Descending order of numbers");

        list.stream().sorted((i1,i2)->i1<i2?1:i1>i2?-1:0).forEach(System.out::println);


    }
}
