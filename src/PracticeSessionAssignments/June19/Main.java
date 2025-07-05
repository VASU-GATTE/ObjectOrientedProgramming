package PracticeSessionAssignments.June19;

public class Main {
    public static void main(String[] args) {
        Shape c=new Circle(2);
        Shape r=new Rectangle(5,6);
        Shape t=new Triangle(5,6);
        System.out.println("Circle Area : "+c.calculateArea());
        System.out.println("Rectangle Area : "+r.calculateArea());
        System.out.println("Triangle Area : "+t.calculateArea());
    }
}
