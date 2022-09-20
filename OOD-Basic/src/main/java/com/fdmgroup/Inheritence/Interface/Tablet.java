package com.fdmgroup.Inheritence.Interface;

public class Tablet implements Chargable{
    @Override
    public void charge(double amps) {
        System.out.println("Tablet is charging " + amps);
    }

    public void displayApp(){
        System.out.println("tablet is displaying app");
    }
}
