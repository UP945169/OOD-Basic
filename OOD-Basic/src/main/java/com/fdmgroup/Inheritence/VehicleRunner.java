package com.fdmgroup.Inheritence;

import java.util.ArrayList;
import java.util.List;

public class VehicleRunner {
    public static void main(String[] args) {
        //Vehicle vehicle1 = new Vehicle(); objects of this type cannot be created
        Plane plane1 = new Plane();
        Car car1 = new Car();

        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(car1);
        vehicleList.add(plane1);

        for (Vehicle vehicle:vehicleList) {
            vehicle.accelerate();
        }
    }
}
