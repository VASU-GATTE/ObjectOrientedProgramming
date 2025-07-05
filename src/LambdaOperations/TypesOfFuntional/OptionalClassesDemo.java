package LambdaOperations.TypesOfFuntional;

import java.util.Optional;

public class OptionalClassesDemo {
    public static void main(String[] args) {
        Optional<Student> o=Optional.ofNullable(new Student(0,null));
        Student Default=o.orElse(new Student(1, "Vasu krishna"));
        o.ifPresent(s-> System.out.println(s));

    }
}
