package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    List<Employee> employeeList=new ArrayList<>();
    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee Added "+employee+" Successfully....");
    }

    @Override
    public Employee getEmployeeById(int id) {
        for (Employee e:employeeList){
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        for (int i=0;i<employeeList.size();i++){
            if(employeeList.get(i).getId()==employee.getId()){
                employeeList.set(i,employee);
                System.out.println("Employee Updated");
                return employee;
            }
        }
        System.out.println("Employee Not Found! ");
        return null;
    }

    @Override
    public void deleteEmployee(int id) {
        boolean found=false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId()==id){
                employeeList.remove(i);
                found=true;
                System.out.println("employee with Id : "+id+" is deleted");
            }
        }
        if(!found){
            System.out.println("Employee not Found.");
        }

    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeList;
    }

}
