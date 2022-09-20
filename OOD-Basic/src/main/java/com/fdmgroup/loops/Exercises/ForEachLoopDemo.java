package com.fdmgroup.loops.Exercises;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopDemo {
    public static void main(String[] args) {
        //1 Array of courses
        String[] courses = {"Unix","SQL","Java","Python","Web Apps"};

        for (String course:courses) {
            System.out.println("I love learning " + course);
        }

        //2 Copying to an ArrayList
        List<String> coursesList = new ArrayList<>();

        for (String course:courses) {
            coursesList.add(course);
        }

        //3 Displaying the courses
        for (String course:coursesList) {
            System.out.println(course);
        }

        //4 Total Price
        double sum = 0;
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(4.50);
        prices.add(1.99);
        prices.add(9.75);
        prices.add(3.15);
        prices.add(10.25);

        for (double price:prices) {
            //sum = sum + price;
            sum += price;

        }
        System.out.println(sum);

        //5 Copying to an array

        double[] emptyArray = new double[5];
        int index = 0;
        for (double price:prices) {
            emptyArray[index] = price;
            index++;
        }

        //6 Adding numbers from a String
        String Stringtext = "10,7,25,3,8";

        String[] textArray = Stringtext.split(",");

        int total = 0;

        for (String text:textArray) {
            total += Integer.parseInt(text);
        }

        //7 Reversing a String
        String reversedText = "desrever neeb sah txet siht";

        char[] reversedTextArray = reversedText.toCharArray();

        String normalText = "";

        for (char reversedLetter:reversedTextArray) {
            normalText = reversedLetter + normalText;

        }
        System.out.println(normalText);


    }
}
