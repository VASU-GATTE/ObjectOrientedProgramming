package Example;

import Example.DAO.EmployeeDAO;
import Example.DAO.EmployeeDAOAdapter;
import Example.DTO.Employee;

import java.util.List;

public class EmployeeServiceAdapter implements EmployeeService{
    EmployeeDAO employeeDAO=new EmployeeDAOAdapter();

    @Override
    public void addEmployee(Employee employee) {
        employeeDAO.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
        return employeeDAO.findByID(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
        return employeeDAO.update(employee);
    }

    @Override
    public void deleteEmployee(int id) throws EmployeeNotFoundException {
        employeeDAO.deleteByID(id);
    }
}
