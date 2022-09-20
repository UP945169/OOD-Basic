package com.fdmgroup.Inheritence;

public abstract class Vehicle {
    private int maxSpeed;

    public abstract void accelerate();

    public abstract String Vehicle(int number);

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
