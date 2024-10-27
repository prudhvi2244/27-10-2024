package p1.p2;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        List list=new ArrayList();
        map.entrySet().stream().filter(e->e.getValue()>=30).forEach(e->{
          list.add(e.getKey());
        });
        System.out.println(list);

    }

}
