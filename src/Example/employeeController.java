package Example;

import Example.DTO.Employee;

import java.util.List;

public class employeeController {
    public static void main(String[] args) {
        EmployeeService service=new EmployeeServiceAdapter();
        service.addEmployee(new Employee(111,"vasu",600000));
        service.addEmployee(new Employee(112,"Krishna",500000));
        service.addEmployee(new Employee(113,"Kethan",400000));
        service.addEmployee(new Employee(114,"Sai",300000));
        service.addEmployee(new Employee(115,"Kumar",200000));

        System.out.println("All Employees");
        System.out.println("=====================================");
        List<Employee> employees=service.getAllEmployees();
        for(Employee emp:employees){
            System.out.println(emp);
        }

        System.out.println("Get Employee By Id 2");
        try{
        Employee emp=service.getEmployeeById(112);
        }catch (EmployeeNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Employee Update with Record 114");
        try{
            Employee updated=service.updateEmployee(new Employee(114,"Goku",700000));
            System.out.println("Employee Updated Successfully");
        }catch(EmployeeNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Delete the Employee record with 115");
        try{
            service.deleteEmployee(115);
            System.out.println("Deleted Successfully");
        }catch (EmployeeNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("ALl Employees ");
        System.out.println("====================================");
        for(Employee emp:employees){
            System.out.println(emp);
        }


    }
}
