package com.fdmgroup.Inheritence.Interface;

public class PortableLamp implements Chargable, Lamp {

    @Override
    public void charge(double amps) {
        System.out.println("Portable Lamp is charging " + amps);
    }

    @Override
    public void produceLight() {
        System.out.println("Produce Light");
    }
}
