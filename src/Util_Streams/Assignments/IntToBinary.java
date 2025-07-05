package Util_Streams.Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntToBinary {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,4,2,43,14,65,32,45);

        List<String> bin= num.stream().
                map(i->Integer.toBinaryString(i)).
                collect(Collectors.toList());

        System.out.println(bin);
    }
}
