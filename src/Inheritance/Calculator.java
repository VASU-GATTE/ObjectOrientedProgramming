package Inheritance;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num1=sc.nextInt();
        System.out.println("Enter Another Number : ");
        int num2=sc.nextInt();
        My_Calculation mc=new My_Calculation(num1,num2);
        System.out.println("Multiplication : "+mc.Multipliction()+"\nAddition : "+mc.Addition());
    }
}
