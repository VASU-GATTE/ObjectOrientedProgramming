package Inheritance;

public class Office{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.DisplayDetails();
        Manager m=new Manager("Vasu","CSE",100000000);
        m.DisplayDetails();
//        e.DisplayDetails();

    }
}
