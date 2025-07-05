package LambdaOperations.TypesOfFuntional;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Student> c=s-> System.out.println(s.getId());
        c.accept(new Student(1,"Vasu"));
    }
}
