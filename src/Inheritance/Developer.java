package Inheritance;

public class Developer extends Employee{
    String department;

    Developer(String name,double salary,String department){
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
    void displayDetails(){
        System.out.println("Developer Details");
        System.out.println("Name : "+name+"\nsalary : "+department);
    }
}
