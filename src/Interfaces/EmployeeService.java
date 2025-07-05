package Interfaces;

import java.util.List;

public interface EmployeeService {
    public void addEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    public Employee updateEmployee(Employee employee);

    public void deleteEmployee(int id);

    public List<Employee> getAllEmployee();
}
