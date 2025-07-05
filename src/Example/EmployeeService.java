package Example;

import Example.DTO.Employee;

import java.util.List;

public interface EmployeeService {

    public void addEmployee(Employee employee);

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(int id) throws EmployeeNotFoundException;

    public Employee updateEmployee(Employee employee)throws EmployeeNotFoundException;

    public void deleteEmployee(int id)throws EmployeeNotFoundException;
}
