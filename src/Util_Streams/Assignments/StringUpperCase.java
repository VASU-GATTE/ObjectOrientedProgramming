package Util_Streams.Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCase {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("vasu","krishna","is","a","good","boy");

        List<String> str=names.stream().
                map(s->s.toUpperCase()).
                collect(Collectors.toList());

        System.out.println(str);
    }
}
