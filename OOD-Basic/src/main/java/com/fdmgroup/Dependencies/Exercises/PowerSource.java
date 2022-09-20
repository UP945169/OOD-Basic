package com.fdmgroup.Dependencies.Exercises;

public class PowerSource {
    //creating custom data type
    private double watts;

    public PowerSource(double watts) {
        this.watts = watts;
    }

    public void setWatts(double watts) {
        this.watts = watts;
    }

    public double supplyPower() {
        return watts;
    }


}
