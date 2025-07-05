package Interfaces;

public interface SmartDeviceEvents {
    void onPowerOn();
    void onPowerOff();
    void onTemparatureChange(double newTemparature);
    void onMotionDetected();
    void onScheduleRing();
}
