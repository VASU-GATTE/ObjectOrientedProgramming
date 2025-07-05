package Util_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        Stream<Integer> s=numbers.stream();
        Stream<Integer> even1=s.filter(i->i%2==0);
        even1.forEach(System.out::println);



        List<Integer> num= Arrays.asList(2,10,30,42,54,12,43,23);

        List<Integer> even=num.stream()
                .filter((i->i%2==0))
                .collect(Collectors.toList());
        System.out.println(even);



        List<String> names=Arrays.asList("Vasu","Krishna","Java","Jerry","Jack Sparrow");

        List<String> jnames=names.stream()
                .filter(name->name.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println(jnames);


        List<Adult> custom=Arrays.asList(new Adult("Vasu",20),
                new Adult("Krishna",20),
                new Adult("Sai",24),
                new Adult("Goku",15),
                new Adult("Vegeta",15));
        List<Adult> adults=custom.stream().
                filter(p->p.age>18)
                .collect(Collectors.toList());
        System.out.println(adults);
    }
}
//Filter positive numbers from neg and pos numbers     ^
//Filter palindromes from a list of string              ^
//Filter employees with salary greater than certain amount.            ^
//Filter numbers greater than the average                              ^
//Filter words length longer than 4 characters.                        ^
//Filter positive numbers and sort them in descending order            ^
//Filter non-empty strings                                             ^
//Filter out null values from a list.                                  ^

