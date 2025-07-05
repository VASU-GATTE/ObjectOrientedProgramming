package Interfaces;

public class Car_Controls{
    public static void main(String[] args) {
        Car l=new Lamborgini();
        l.accelerate(10);
        l.accelerate(50);
        l.accelerate(99);
        l.accelerate(200);
        l.turnDirection("left");
        //l.fourWheels();                we cant use this because it was not in car interface only in lamborgini so we cant call it using car reference variable.
        l.stop();

        System.out.println("\n\n");

        Car b=new Buggatti();
        b.accelerate(90);
        b.accelerate(290);
        b.accelerate(390);
        b.accelerate(190);
        b.turnDirection("Right");
        b.stop();
        
    }
}
