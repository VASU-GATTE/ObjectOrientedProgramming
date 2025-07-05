package Util_Streams.Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NullValues {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Vasu",null,"Krishna",null,"Null",null);

        List<String> l2=l.stream().
                filter(s->s!=null).
                collect(Collectors.toList());
        System.out.println(l2);
    }
}
