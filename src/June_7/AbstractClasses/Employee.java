package June_7.AbstractClasses;

public abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
    public abstract double calculateSalary();
    public void display(){
        System.out.println("Employee : "+name);
    }
}
