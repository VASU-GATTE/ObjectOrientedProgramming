package PracticeSessionAssignments.June19;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle extends Shape{
    int length;
    int breadth;

    @Override
    public double calculateArea(){
        return length*breadth;
    }
}
