package Util_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingStreamsExamples {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("vasu","Krishna","Great","Goku","Vegeta","Saitama");

        long count=names.stream().filter(i->i.length()%2==5).count();
        System.out.println("Total No of Names : "+count);

        List<String> sorted=names.stream().sorted().collect(Collectors.toList());
        System.out.println("Names in ascending order.");

        List<String> descNames=names.stream()
                .sorted((i1,i2)->i1.compareTo(i2))
                .collect(Collectors.toList());
        System.out.println("Descending :"+descNames);

        //Min Method
        String min=names.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("Min : "+min);

        //Max Method
        String max=names.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("Max : "+max);


        //ToArray Method
        String[] namesArray=names.stream().toArray(String[]::new );
        System.out.println(Arrays.toString(namesArray));

        //Stream.of method
        Stream<Integer> s= Stream.of(99,100,20,999);
        s.forEach(System.out::println);
        s.forEach(ob-> System.out.println(ob));
    }
}
