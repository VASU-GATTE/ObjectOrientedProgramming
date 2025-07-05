package Collections;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getId(),e2.getId());
        //return e1.getName().compareTo(e2.getName());
        //return Double.compare(e1.salary,e2.salary);
    }
}
