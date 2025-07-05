package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Employee> hashset= new HashSet<>();
        hashset.add(new Employee(1,"Vasu",1000000,"Vijayawada"));
        hashset.add(new Employee(3,"Goku",500000,"DBZ"));
        hashset.add(new Employee(5,"Vegeta",500000,"DBZ"));
        hashset.add(new Employee(4,"Saitama",300000,"OPM"));
        hashset.add(new Employee(2,"Luffy",600000,"OP"));
        //System.out.println(hashset);

        for(Employee e:hashset){
            System.out.println(e);
        }
    }
}
