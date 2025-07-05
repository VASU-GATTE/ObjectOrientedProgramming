package Inheritance.OverRiding;

public class Animal {
    public void makeSound(){
        System.out.println("Make some sound...");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println(" Bark ");
    }
    public void fetch(){
        System.out.println("Fetch the ball ");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
    public void scratch(){
        System.out.println("Scratching Furniture");
    }
}
class TypeCastingDemo{
    public static void main(String[] args) {
        Animal a1=new Dog();
        Animal a2=new Cat();
        Animal a3=null;
        Animal a4=new Animal();

        if(a1 instanceof Dog){
            Dog dog=(Dog)a1;
            System.out.println("a1 is a Dog");
        }
    }
}
