package com.fdmgroup.Arrarys;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        double[] prices = {1.5,2.6,3,4.9};

        System.out.println(prices.length);
        System.out.println(prices[0]);

        prices[3] = 4.20;


        Double[] morePrices = new Double[10];

        String sentence = "This is a sentence";
        String[] words = sentence.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);

        Arrays.sort(prices);

        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);




    }
}
