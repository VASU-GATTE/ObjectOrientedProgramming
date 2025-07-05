package Util_Streams.Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThanAverageFilter {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(10,65,98,44,1,21,61,20,1,12);
        int sum=0;
        for(int num:l){
            sum+=num;
        }
        double avg=(double) sum/l.size();

        List<Integer> l2=l.stream().
                filter(i->i>avg).
                collect(Collectors.toList());
        System.out.println(l2);
        System.out.println(avg);
    }
}
