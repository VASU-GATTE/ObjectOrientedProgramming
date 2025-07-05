package Constructors;

public class Human {
    String name;
    int age;
    Human(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Human h=new Human("Vasu",20);
        System.out.println(h.name+" "+h.age);
    }
}
