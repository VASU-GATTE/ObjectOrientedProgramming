package Util_Streams.Assignments;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveFilterDescending {
    public static void main(String[] args) {
        List<Integer> n= Arrays.asList(12,15,45,45,87,6,4,19,73,10,-46,-56,-48,-1,-6);

        List<Integer> num=n.stream().
                filter(i->i>0).
                collect(Collectors.toList());

        num.sort(Comparator.reverseOrder());                      //Sorting in Descending Order
        System.out.println(num);
    }
}
