package LambdaOperations.TypesOfFuntional;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        Predicate<String> p=s->s.length()>3;
        System.out.println(p.test("Vas"));

        Predicate<Student> p1=s->s.getId()==1&&s.getName()=="Vasu";
        if(p1.test(new Student(1,"Vasu"))){
            System.out.println("Student Found");
        }else{
            System.out.println("Student Not found");
        }


    }
}
