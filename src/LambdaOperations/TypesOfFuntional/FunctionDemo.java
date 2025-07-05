package LambdaOperations.TypesOfFuntional;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Student,Student> p2= s->s;
        System.out.println(p2.apply(new Student(1,"Vasu")));

        Function<String,Integer> p3=s->s.length();
        System.out.println(p3.apply("Vasu"));
    }
}
