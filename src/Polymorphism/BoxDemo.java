package Polymorphism;

public class BoxDemo {
    public static void main(String[] args) {
        Box b1=new Box();
        double volume=b1.Volume();
        System.out.println("Volume : "+volume);
        Box b2=new Box(20);
        double volume2=b2.Volume();
        System.out.println(volume2);


    }
}
