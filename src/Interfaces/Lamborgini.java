package Interfaces;

public class Lamborgini implements Car{
    @Override
    public void turnDirection(String dir) {
        if(dir.equalsIgnoreCase("Left")){
            System.out.println("Lamborgini is Turning Left ");
        }else {
            if(dir.equalsIgnoreCase("Right")){
                System.out.println("Lamborgini is Turning Right ");
            }else{
                System.out.println("Lamborgini is Turning U-Turn ");
            }
        }
    }

    @Override
    public void accelerate(int points) {
        if(points<100 && points>10){
            System.out.println("Lamborgini Speed is "+points);
        }else{
            System.err.println("Lamborgini Speed is "+points);
        }
    }

    @Override
    public void stop() {
        System.out.println("Lamborgini has Stopped ");
    }
    public void fourWheels(){
        System.out.println("Lamborgini engaged with Four wheels Drive ");
    }
}
