package com.codegnan.practice;

import java.util.Scanner;

public class HighestDigit {
    public static int Highest(double num){
        double max=0.0,LastDigit=0.0;
        while (num>0) {
            LastDigit = num % 10;
            if (LastDigit > max) {
                max = LastDigit;
            }
            num /= 10;
        }
        return (int)max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        System.out.println(Highest(num));

    }
}
