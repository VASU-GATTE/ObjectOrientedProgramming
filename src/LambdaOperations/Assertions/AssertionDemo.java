package LambdaOperations.Assertions;

public class AssertionDemo {
    public static void main(String[] args) {
        int x=9;
        System.out.println("Hi");
        System.out.println("Dear");
        System.out.println("How ");
        System.out.println("Are");
        System.out.println("you");
        assert(x>10):"Here X value should be greater than 10";                       //Assert simple version
        System.out.println("No");
        System.out.println("Dear");
        System.out.println("Iam");
        System.out.println("Not ");
        System.out.println("Good");
    }
}
