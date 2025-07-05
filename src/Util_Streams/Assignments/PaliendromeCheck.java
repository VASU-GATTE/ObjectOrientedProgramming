package Util_Streams.Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PaliendromeCheck {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("madam","racecar","Madam","Vasu","Krishna");

        List<String> palen=str.stream().
                filter(s->s.
                        equalsIgnoreCase(new StringBuilder(s).reverse().toString())).
                collect(Collectors.toList());
        System.out.println(palen);
    }
}
