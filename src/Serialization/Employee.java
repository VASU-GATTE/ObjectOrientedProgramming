package Serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Employee implements Serializable {
    int id;
    String name;
    double salary;
    String location;

    public void DisplayDetails(){
        System.out.println("Employee ID : "+id+"\nEmployee Name : "
                +name+"\nEmployee Salary : "
                +salary+"\nEmployee Location : "
                +location);
    }
}
