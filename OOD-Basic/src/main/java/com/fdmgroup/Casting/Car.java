package com.fdmgroup.Casting;

public class Car extends Vehicle{
    private double engineSize;

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public Car(double engineSize) {
        super();
        this.engineSize = engineSize;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }
}
