package Serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    public int id;
    public String name;
    public String email;

    public String toCSV(){
        return id+","+name+","+email;
    }

}
