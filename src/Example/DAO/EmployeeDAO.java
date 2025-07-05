package Example.DAO;

import Example.DTO.Employee;
import Example.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeDAO {
    public void save(Employee employee);
    public List<Employee> findAll();
    public Employee findByID(int id)throws EmployeeNotFoundException;
    public Employee update(Employee employee)throws EmployeeNotFoundException;
    public Employee deleteByID(int id)throws EmployeeNotFoundException;
}
