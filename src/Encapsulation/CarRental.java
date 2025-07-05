package Encapsulation;

import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Car c=new Car();
        System.out.println("Enter a Car Model : ");
        String model=sc.nextLine();
        System.out.println("Enter the Year : ");
        int year=sc.nextInt();
        c.setModel(model);
        c.setYear(year);
        c.DisplayDetails();
    }
}
