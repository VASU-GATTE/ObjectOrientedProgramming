package PracticeSessionAssignments.June19;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangle extends Shape{
    int base;
    int height;

    @Override
    public double calculateArea(){
        return 0.5*base*height;
    }
}
