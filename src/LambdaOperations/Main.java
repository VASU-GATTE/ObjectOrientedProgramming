package LambdaOperations;

public class Main {
    public static void main(String[] args) {
//        LambdaExample o=()-> System.out.println("Hello");
//        o.m1();


//       LambdaExample ob=(a,b)-> {
//           for (int i = 0; i < 10; i++) {
//               System.out.println(a+b);
//               a++;
//           }
//       };
//       ob.m1(10,20);


        LambdaExample ob1=(a,b)->a+b;
        System.out.println(ob1.m2(10,20));
    }
}
