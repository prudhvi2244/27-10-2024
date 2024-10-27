package p1.p2;

import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {

        List<Integer> list=  Arrays.asList(1,2,3,4,5);

        list.stream().filter(i->i%2!=0).map(i->i*2).forEach(System.out::println);
    }
}
