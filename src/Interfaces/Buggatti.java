package Interfaces;

public class Buggatti implements Car{

    @Override
    public void turnDirection(String dir) {
        if(dir.equalsIgnoreCase("Left")){
            System.out.println("Buggatti is Turned Left");
        }else{
            System.out.println("Buggati is Turned Right");
        }
    }

    @Override
    public void accelerate(int points) {
        if(points<200 && points>10){
            System.out.println("Buggatti Speed is "+points);
        }else{
            System.err.println("Buggatti Speed is "+points);
        }
    }

    @Override
    public void stop() {
        System.out.println("Buggatti is Stopped");
    }
}
