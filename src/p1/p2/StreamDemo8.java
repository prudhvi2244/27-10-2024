package p1.p2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo8 {
    public static void main(String[] args) {

       Set<String> set= Set.of("prudhviRaj","Praveen","Pavan","kiran","Sai","Prasad");

       List<String> result=set.stream().filter(s->s.length()>6).map(str->str.toUpperCase()).toList();

       result.forEach(System.out::println);

    }
}
