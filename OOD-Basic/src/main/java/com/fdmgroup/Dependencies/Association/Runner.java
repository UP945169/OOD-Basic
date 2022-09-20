package com.fdmgroup.Dependencies.Association;

public class Runner {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Nick");
        Classroom classroom = new Classroom("Jobs");

        classroom.setTrainee(trainer);
    }
}
