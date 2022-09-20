package com.fdmgroup.conditionals.Exercises;

public class SimpleIfStatements {
    public static void main(String[] args) {
        //1. Alien colours
        String alienColour = "Red";

        /*if(alienColour == "Green"){
            System.out.println("You have gained 5 points");
        }

        //2. Alien colours
        if(alienColour == "Red"){
            System.out.println("You have gained 10 points");
        } else if (alienColour == "Yellow") {
            System.out.println("You have gained 15 points");
        }*/

        //merged if statements

        if(alienColour == "Green"){
            System.out.println("you have gained 5 points");
        } else if (alienColour == "Red") {
            System.out.println("You have gained 10 points");
        }else {
            System.out.println("You have gained 15 points");
        }

        //4. Stages of life
        int age = 23;
        if (age < 2){
            System.out.println("You're a baby");
        } else if (age < 4){
            System.out.println("You're a toddler");
        } else if (age < 13){
            System.out.println("You're a child");
        } else if (age < 20){
            System.out.println("You're a teenager");
        } else if (age < 65){
            System.out.println("You're a working age adult");
        } else {
            System.out.println("You're a pensioner");
        }


        //5. Tax rates
        int salary = 24000;

        if(salary > 150000){
            System.out.println("45%");
        } else if (salary >= 50000 && salary == 150000) {
            System.out.println("40%");
        }
        if (salary >= 12500 && salary <= 50000){
            System.out.println("20%");
        } else if (salary <= 12500) {
            System.out.println("0%");
        }
    }
}
