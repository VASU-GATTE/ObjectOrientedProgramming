package Util_Streams.Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordLength {
    public static void main(String[] args) {
        List<String> word= Arrays.asList("Vasu","Krishna","SonGoku","Jiren","Kakashi","Naruto","sai","Bill");

        List<String> words=word.stream().
                filter(w-> w.length()>4).
                collect(Collectors.toList());
        System.out.println(words);
    }

}
