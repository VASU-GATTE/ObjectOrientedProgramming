package Util_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(2,1,5,4,4,8,4,5,4,5,4);

        List<Integer> nums=numbers.stream().
                map(i->i*2).
                collect(Collectors.toList());
        System.out.println(nums);
    }
}

//Convert list of strings to uppercase                ^
//Extract the length of each string in a  list        ^
//convert a list of integers to they square Roots.    ^
//Convert list of strings to their first character.   ^
//Add prefix to each element in a list of strings     ^
//Convert list of integers to their binary representation.      ^