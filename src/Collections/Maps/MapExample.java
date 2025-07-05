package Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,Student> school=new HashMap<>((Map) new MyComparable());
        school.put(1,new Student(101,"Vasu"));
        school.put(2,new Student(102,"Goku"));
        school.put(3,new Student(103,"Jiren"));
        school.put(4,new Student(104,"Picollo"));
        school.put(5,new Student(105,"Gohan"));

        for(Student s:school.values()) {
            System.out.println(s);
        }

    }
}
