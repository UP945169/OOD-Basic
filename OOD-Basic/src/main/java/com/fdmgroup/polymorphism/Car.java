package com.fdmgroup.polymorphism;

public class Car extends  Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Car is acc");
    }


    //super to access the private variable in Vehicle

    @Override
    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 70){
            super.setMaxSpeed(maxSpeed);
        }
        else {
            super.setMaxSpeed(70);
        }
    }
}
