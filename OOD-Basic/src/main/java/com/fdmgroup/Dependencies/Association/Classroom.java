package com.fdmgroup.Dependencies.Association;

public class Classroom {
    //uses custom data trainer
    //creates classroom data type
    //
    private Trainer trainee;
    private String name;


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

    public Classroom(String name) {
        super();
        this.name = name;
    }
}
