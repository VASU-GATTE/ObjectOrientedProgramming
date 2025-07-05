package PracticeSessionAssignments.June19;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Shape{
    int radius;

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }
}
