package Inheritance;

public class Manager extends Employee {
    String department;

    public Manager(String name,String department,double salary) {
        this.name=name;
        this.department = department;
        this.salary=salary;
    }
    void DisplayDetails(){
        System.out.println("Manager Detials");
        System.out.println("Name : "+name+"\nSalary : "+salary+"\nDepartment : "+department);
    }
}
