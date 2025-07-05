package June_7.AbstractClasses;

abstract class Vehicle {
    abstract int getNoOfWheels();
}
class Bus extends Vehicle{

    @Override
    public int getNoOfWheels() {
        return 7;
    }
}
class Auto extends Vehicle{
    @Override
    public int getNoOfWheels(){
        return 10;
    }
}
class Main{
    public static void main(String[] args) {
        Vehicle v=new Auto();
        System.out.println(v.getNoOfWheels());
    }
}