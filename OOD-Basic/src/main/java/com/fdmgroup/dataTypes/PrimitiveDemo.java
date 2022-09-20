package com.fdmgroup.dataTypes;

public class PrimitiveDemo {
    public static void main(String[] args) {
        //Left to the = sign we have the reference, the reference has the datatype and the name of the variable

        byte score = 100;
        System.out.println(score);

        short matchAttendance = 25000;
        System.out.println(matchAttendance);

        long populationWorld = 60000000000000L;
        System.out.println(populationWorld);

        // all floating point numbers are taken as double by default
        float price = 1.99F;

        double priced = 1.99;

        //char holds a single unicode character
        //needs to use single quotation marks

        char letter1  ='a';
        char letter2  ='b';

        System.out.println(letter1 + letter2);

        System.out.println((int) letter1);
        System.out.println((int) letter2);
    }
}
