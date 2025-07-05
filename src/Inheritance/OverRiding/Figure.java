package Inheritance.OverRiding;

public class Figure {
    double dim1, dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public double area() {
        System.out.println("Area for figure is undeined");
        return 0;
    }
}

