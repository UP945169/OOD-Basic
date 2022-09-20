package com.fdmgroup.Methods.Exercises;

public class modulesPreviousCodes {
    public static void main(String[] args) {
        //1. Alien colours
        String alienColour = "Red";
        int points = getPoints("Red");
        System.out.println("You have scored " + points + " points");

        //2. Summing numbers
        System.out.println(sumOfNumbersUpTo(5));


        timesTable(5);

    }

    public static int getPoints(String colour){
        if(colour == "Green"){
            return 5;
        } else if (colour == "Red") {
            return 10;
        }else {
            return 0;
        }
    }

    public static long sumOfNumbersUpTo(int countVariable){
        long sum = 0;
        for (int i = 1; i <= countVariable; i++) {
            sum += i;
        }
        return sum;
    }

    public static void timesTable(int timesTableReq){
        for (int number = 1; number <= 12; number++) {
            int answer = number * timesTableReq;
            System.out.println(number + " * " + timesTableReq + " = " + answer);
        }
    }
}
