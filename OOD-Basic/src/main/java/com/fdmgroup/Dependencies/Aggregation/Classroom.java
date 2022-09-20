/*
package com.fdmgroup.Dependencies.Aggregation;


import java.util.ArrayList;
import java.util.List;

public class Classroom {
    //uses custom data trainer
    //creates classroom data type
    //
    private Trainer trainee;
    private String name;
    //a place to store a collection of objects and then have methods to manage them
    private List<Trainee> trainees = new ArrayList<Trainee>();

    private int capacity;



    public Trainer getTrainee() {
        return trainee;
    }

    public void setTrainee(Trainer trainee) {
        this.trainee = trainee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTrainee(Trainee trainee){
        if (trainees.size() < capacity){
            trainees.add(trainee);
        }

    }

    public List<Trainee> getTrainees() {
        return trainees;
    }

    public void removeTrainee(Trainee trainee){
        if (trainees.contains(trainee)){
            trainees.remove(trainee);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Classroom(String name) {
        super();
        this.name = name;
    }
}
*/
