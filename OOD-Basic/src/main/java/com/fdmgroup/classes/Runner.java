package com.fdmgroup.classes;


public class Runner {

    public static void main(String[] args) {
        Trainee trainee1 = new Trainee("John","Java",5);
        Trainee trainee2 = new Trainee("Jane","Python", 6);

        trainee1.learn();
        trainee2.learn();

        int trainee1Result = trainee1.takeExam("Java");
        int trainee2Result = trainee2.takeExam("Python");
    }
}
