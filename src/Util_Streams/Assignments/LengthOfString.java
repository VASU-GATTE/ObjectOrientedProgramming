package Util_Streams.Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class LengthOfString {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Vasu","Krishna","Is","Great","Guy");

        List<Integer> l2=l.stream().
                map(s->s.length()).
                collect(Collectors.toList());
        System.out.println(l2);
    }

    public static class PrefixAdd {
        public static void main(String[] args) {
            List<String> l= Arrays.asList("Vasu","Krishna","Gatte","Great","Smart");

            List<String> l2 =l.stream().
                    map(s->"A"+s).
                    collect(Collectors.toList());
            System.out.println(l2);
        }
    }
}
