package com.fdmgroup.polymorphism;

public abstract class Vehicle {
    private int maxSpeed;

    public void accelerate(){
        System.out.println("Accelerate from Vehicle");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
