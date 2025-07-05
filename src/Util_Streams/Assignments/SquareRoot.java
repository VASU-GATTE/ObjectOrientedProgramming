package Util_Streams.Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareRoot {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,12,43,13,14,15,16,17,18,19,20,21,24,26);

        List<Integer> sqr=num.stream().
                map(i->i*i).
                collect(Collectors.toList());

        System.out.println(sqr);
    }
}
