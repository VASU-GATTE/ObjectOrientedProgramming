package Polymorphism;

public class OverLoadDemo {
    public static void main(String[] args) {
        Test ob=new Test();
        ob.test();
        ob.test(30);
        ob.test("Krishna");
        StringBuilder sb=new StringBuilder("Vasu");
        System.out.println(Test.test(sb));
        ob.test(ob);
    }
}
