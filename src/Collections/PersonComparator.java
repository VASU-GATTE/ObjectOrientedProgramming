package Collections;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {


    @Override
    public int compare(Person ob1,Person ob2) {
        return Integer.compare(ob1.id,ob2.id);
    }
}
