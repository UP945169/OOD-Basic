package com.fdmgroup.polymorphism;

public class TraineeRunner {
    public static void main(String[] args) {
        Trainee trainee1 = new Trainee("JOhn", "Java", 7);
        Trainee trainee2 = new Trainee("JOhn", "Java", 7);

        System.out.println(trainee1.equals(trainee2));


    }
}
