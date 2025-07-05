package Encapsulation;

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee emp=new Employee(101,"Vasu",1000000);
        emp.displayDetails();
        emp.setSalary(-10000);
        emp.setEmployeeId(401);
        emp.setEmpName("Krishna");
        emp.displayDetails();
    }
}
