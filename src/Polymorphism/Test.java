package Polymorphism;

public class Test {
    public void test(){
        System.out.println("O - Arguments");
    }
    public void test(int number){
        System.out.println("single Argument : "+number);
    }
    public void test(String name){
        System.out.println("Name : "+name);
    }
    public static StringBuilder  test(StringBuilder name){
        return name.reverse();
    }
    public void test(Object ob){
        System.out.println(ob);
    }
}
