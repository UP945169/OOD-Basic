package com.fdmgroup.Methods;

public class MethodDemo {

    public static void main(String[] args) {
        int length1 = 583;
        int length2 = 371;
        int longestLength = getLargestNumber(length1, length2);


        System.out.println("Longest length is " + longestLength);

//        if (length1 > length2) {
//            longestLength = length1;
//        } else {
//            longestLength = length2;
//        }
        //

        int speed1 = 75;
        int speed2 = 150;
        int fastestSpeed;

        System.out.println("fastest speed is " + getLargestNumber(speed1, speed2));


        /*if (speed1 > speed2) {
            fastestSpeed = speed1;
        } else {
            fastestSpeed = speed2;
        }

        */

    }
    // STATIC
    public static int getLargestNumber(int value1, int value2){
        int longestLength = 0;
        if (value1 > value2) {
            //longestLength = value1;
            return value1;
        } else {
            //longestLength = value2;
            return value2;
        }
    }

    public static void getLargestNumberVoid(int value1, int value2){
        int longestLength = 0;
        if (value1 > value2) {
            //longestLength = value1;
            System.out.println("Voided method option gives is " + value1);
        } else {
            //longestLength = value2;
            System.out.println("Voided method option gives is " +value2);
        }
    }

    //the ...numbers means we can work with as many numbers as we want and need
    public static void printNumbers(int...numbers){
        for(int number:numbers){
            System.out.println(number);
        }
    }
}
