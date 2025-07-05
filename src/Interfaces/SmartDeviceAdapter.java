package Interfaces;

abstract class SmartDeviceAdapter implements SmartDeviceEvents{
    public void onPowerOn(){}
    public void onPowerOff(){}
    public void onTemparatureChange(double newTemparature){}
    public void onMotionDetected(){}
    public void onScheduleRing(){}
}
