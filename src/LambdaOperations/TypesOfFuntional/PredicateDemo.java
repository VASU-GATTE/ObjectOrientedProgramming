package LambdaOperations.TypesOfFuntional;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> g= (n)->n>10;
        System.out.println(g.test(11));
    }
}
