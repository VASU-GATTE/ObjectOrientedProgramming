package Collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Employee> treeSet=new TreeSet<Employee>(new EmployeeIdComparator());
        treeSet.add(new Employee(1,"vasu",1000000,"Vijayawada"));
        treeSet.add(new Employee(3,"goku",500000,"DBZ"));
        treeSet.add(new Employee(5,"vegeta",400000,"DBZ"));
        treeSet.add(new Employee(4,"saitama",300000,"OPM"));
        treeSet.add(new Employee(2,"luffy",600000,"OP"));
        for(Employee e:treeSet) {
            System.out.println(e);
        }
    }
}
