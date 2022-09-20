package com.fdmgroup.polymorphism;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();

        car.accelerate();
        car.setMaxSpeed(1000);

        System.out.println(car.getMaxSpeed());

    }

}
