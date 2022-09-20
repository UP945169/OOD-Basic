package com.fdmgroup.Dependencies.Exercises;

public class Computer {
    private final String MODEL;
    private HardDrive hardDrive;
    private Memory memory;
    private final Processor processor;

    public Computer(String MODEL, HardDrive hardDrive, Memory memory, Processor processor) {
        this.MODEL = MODEL;
        this.hardDrive = hardDrive;
        this.memory = memory;
        this.processor = processor;
    }

    public String getMODEL() {
        return MODEL;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void turnOff(){

    }

    public void turnOn(){

    }

    //Over here is a dependency on Power source
    public void getPower(PowerSource powerSource){
        System.out.println(powerSource.supplyPower() + " watts received from power source");

    }
}
