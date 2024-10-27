package p1.p2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemo7 {
    public static void main(String[] args) {

     List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
     long n=list.stream().count();
     Optional<Integer> opt= list.stream().min((i1, i2)->i1.compareTo(i2));
     opt.ifPresent((t)-> System.out.println(t));

        Optional<Integer> opt1= list.stream().max((i1, i2)->i1.compareTo(i2));
        opt1.ifPresent((t)-> System.out.println(t));

    }
}
