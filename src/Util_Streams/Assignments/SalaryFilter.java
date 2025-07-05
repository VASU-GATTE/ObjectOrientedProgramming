package Util_Streams.Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryFilter {
    public static void main(String[] args) {
        List<Employee> l= Arrays.asList(new Employee("Vasu",100000),
                new Employee("Krishna",20000),
                new Employee("Sai",50000),
                new Employee("Kethan",15000));

        List<Employee> l2= l.stream().
                filter(d->d.salary<=20000).
                collect(Collectors.toList());
        System.out.println(l2);

    }
}
