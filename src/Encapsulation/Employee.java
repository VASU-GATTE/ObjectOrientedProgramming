package Encapsulation;

public class Employee {
    int employeeId;
    String empName;
    double salary;

    public Employee(int employeeId, String empName, double salary) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary>0) {
            this.salary = salary;
        }else{
            System.err.println("Salary Value must be a Positive Value");
        }
    }
    void displayDetails(){
        System.out.println("------------Employee Details--------------");
        System.out.println("Employee Id : "+employeeId+"\nName : "+empName+"\nSalary : "+salary);
    }
}
