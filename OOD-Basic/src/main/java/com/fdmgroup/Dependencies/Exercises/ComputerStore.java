package com.fdmgroup.Dependencies.Exercises;

import java.util.ArrayList;

//

public class ComputerStore {
    private String name;
    private ArrayList<Computer> computers = new ArrayList<Computer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComputerStore(String name){
        this.name = name;
    }

    public void addComputer(Computer computer){
        computers.add(computer);
    }

    public ArrayList<Computer> getAllComputers(){

        return computers;
    }
}
