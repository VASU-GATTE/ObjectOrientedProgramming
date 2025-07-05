package Encapsulation;

import java.util.Scanner;

public class Car {
    private String Model;
    private int year;

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    void DisplayDetails(){
        System.out.println("Car Model : "+Model+"\nYear : "+year);
    }
}
