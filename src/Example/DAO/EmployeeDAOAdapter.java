package Example.DAO;

import Example.DTO.Employee;
import Example.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOAdapter implements EmployeeDAO{
    List<Employee> employeeList=new ArrayList<>();
    @Override
    public void save(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public Employee findByID(int id) throws EmployeeNotFoundException {
        for(Employee e:employeeList){
            if(e.getId()==id){
                return e;
            }
        }
        throw new EmployeeNotFoundException("Employee with Id :"+id+" not Found");
    }

    @Override
    public Employee update(Employee employee) throws EmployeeNotFoundException {
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getId()==employee.getId()){
                employeeList.set(i,employee);
                return employee;
            }
        }
        throw new EmployeeNotFoundException("Employee with id "+employee.getId()+" not found");
    }

    @Override
    public Employee deleteByID(int id) throws EmployeeNotFoundException {
        boolean found=false;
        for (int i = 0; i < employeeList.size(); i++) {
            if(employeeList.get(i).getId()==id){
                employeeList.remove(i);
                found=true;
                break;
            }
        }
        return null;
    }



}
