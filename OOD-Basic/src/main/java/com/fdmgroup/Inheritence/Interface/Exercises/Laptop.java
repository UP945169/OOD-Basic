package com.fdmgroup.Inheritence.Interface.Exercises;

public class Laptop implements BasketItem{
    private double price;

    private String name;

    private double cpuSpeed;

    private double memory;

    private double hardDrive;

    public Laptop(double price, String name, double cpuSpeed, double memory, double hardDrive) {
        this.price = price;
        this.name = name;
        this.cpuSpeed = cpuSpeed;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(double hardDrive) {
        this.hardDrive = hardDrive;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
