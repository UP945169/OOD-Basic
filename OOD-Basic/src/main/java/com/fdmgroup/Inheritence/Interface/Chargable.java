package com.fdmgroup.Inheritence.Interface;

public interface Chargable {

    //ONLY public, final and static attributes
    double IMPEDANCE = 15;

    //methods in interfaces are abstract by default
    //methods in interfaces are public by default
    void charge(double amps);


    static double calculateWatts(int volts, double amps){
        return volts * amps;
    }

    default void connectToUSB(){
        System.out.println("Connecting to usb...");
    }
}
