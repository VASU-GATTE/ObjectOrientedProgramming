package Collections;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    double salary;
    String address;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}
