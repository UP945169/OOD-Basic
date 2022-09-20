package com.fdmgroup.Casting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(1.6);
        Plane plane = new Plane(5);

        Vehicle vehicle = car;
        vehicle.accelerate();

        List<Vehicle> vehicleList = new ArrayList<Vehicle>(Arrays.asList(car, plane));
        for (Vehicle eachVehicle:vehicleList) {
            if(eachVehicle instanceof Car){
                
            }
        }

        Car downCastcar = (Car) vehicle;
        downCastcar.accelerate();

    }
}
