package Collections.Maps;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
        // return Integer.compare(o1.id,o2.id);
    }
}
