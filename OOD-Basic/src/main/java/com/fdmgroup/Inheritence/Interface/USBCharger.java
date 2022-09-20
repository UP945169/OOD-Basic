package com.fdmgroup.Inheritence.Interface;

public class USBCharger {
    private double amps;

    public USBCharger(double amps) {
        super();
        this.amps = amps;
    }

    public double getAmps() {
        return amps;
    }

    public void setAmps(double amps) {
        this.amps = amps;
    }

    public void supplyPower(Chargable chargableObject){
        chargableObject.charge(amps);
    }
}
