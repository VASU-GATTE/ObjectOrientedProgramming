package com.codegnan.practice;

public class MethodOverriding {
    void animal(){
        System.out.println("Dog....");
    }
}
class Animal extends MethodOverriding{

    void animal(){
        System.out.println("Tiger....");
        super.animal();
    }
}
class Animal2 extends Animal{
    @Override
    void animal(){
        System.out.println("Lion");
        super.animal();
    }
}
class Main{
    public static void main(String[] args) {
        Animal2 a2=new Animal2();
        a2.animal();
    }
}
