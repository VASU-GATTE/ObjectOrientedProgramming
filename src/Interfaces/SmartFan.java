package Interfaces;

public class SmartFan extends SmartDeviceAdapter{
    public void onTemparatureChange(double temparature){
        if(temparature>=30){
            System.out.println("it's Hot!  Turning on smart Fan ");
        }else{
            System.out.println("Switching off the Smart fan");
        }
    }
    public static void main(String[] args) {
        SmartFan sf=new SmartFan();
        sf.onTemparatureChange(200);
    }
}
