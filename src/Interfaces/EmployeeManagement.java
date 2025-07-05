package Interfaces;

public class EmployeeManagement {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.addEmployee(new Employee(101, "Vasu", 100000));
        employeeService.addEmployee(new Employee(102, "Sai", 50000));
        employeeService.addEmployee(new Employee(103, "Kethan", 70000));
        employeeService.addEmployee(new Employee(104, "Krishna", 40000));
        System.out.println("====================================================================================================");

        System.out.println("All Employees ");
        System.out.println("-----------------------------------------");
        for (Employee emp : employeeService.getAllEmployee()) {
            System.out.println(emp + "\n");
        }
        System.out.println("====================================================================================================");

        Employee emp = employeeService.getEmployeeById(102);
        if (emp == null) {
            System.out.println("Employee Not Found !");
        } else {
            System.out.println("Requested Employee : " + emp);
        }
        System.out.println("====================================================================================================");

        Employee updated = employeeService.updateEmployee(new Employee(104, "Hari", 10000));
        if (updated == null) {
            System.out.println("Required Id not found ");
        } else {
            System.out.println("Updated Successfully " + updated);
        }
        System.out.println("====================================================================================================");

        System.out.println("All Employees (After Modification) ");
        System.out.println("------------------------------------------");
        for (Employee emp2 : employeeService.getAllEmployee()) {
            System.out.println(emp2 + "\n");
        }
    }
}
