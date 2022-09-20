package com.fdmgroup.Inheritence.Interface;

public class Mobile implements Chargable{
    @Override
    public void charge(double amps) {
        System.out.println("Mobile is charging with " + amps);
    }
}
