package Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Employee> linkedhashset=new LinkedHashSet<>();
        linkedhashset.add(new Employee(1,"Vasu",1000000,"Vijayawada"));
        linkedhashset.add(new Employee(3,"Goku",500000,"DBZ"));
        linkedhashset.add(new Employee(2,"Vegeta",500000,"DBZ"));
        linkedhashset.add(new Employee(4,"Saitama",300000,"OPM"));
        linkedhashset.add(new Employee(2,"Luffy",600000,"OP"));

        for(Employee e:linkedhashset){
            System.out.println(e);
        }
    }
}
