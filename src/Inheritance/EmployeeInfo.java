package Inheritance;

import java.util.Scanner;

public class EmployeeInfo extends Employee2 {
    double salary=0;
    EmployeeInfo(String name,String designation,int YearsOfExperience){
        super(name,designation,YearsOfExperience);
    }

    void inputEmployeeDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee name : ");
        empName= sc.nextLine();
        System.out.print("\nEnter Employee Designation : ");
        designation=sc.nextLine();
        System.out.print("\nEnter Years Of Experience : ");
        YearsOfExperience=sc.nextInt();
        System.out.print("\nEnter the Salary : ");
        salary=sc.nextDouble();
        sc.close();

    }
    void displayEmployeeInfo(){
        System.out.println("\n\nName : "+empName+"\nDesignation : "+designation+"\nYears of Experience : "+YearsOfExperience);
    }
    double calculateSalary(){
        return salary*YearsOfExperience;
    }
}
class Main{
    public static void main(String[] args) {
        EmployeeInfo ob=new EmployeeInfo("","",0);
        ob.inputEmployeeDetails();
        ob.displayEmployeeInfo();
        System.out.println("Salary for "+ob.YearsOfExperience+" Years : "+ob.calculateSalary());
    }
}
