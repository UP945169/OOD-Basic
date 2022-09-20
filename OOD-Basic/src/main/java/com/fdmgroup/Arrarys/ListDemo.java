package com.fdmgroup.Arrarys;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<Double>();
        prices.add(10.0);
        prices.add(5.70);
        prices.add(5.60);

        System.out.println(prices.size());
        System.out.println(prices.get(2));


        System.out.println("Check is list contains 2.50: " + prices.contains(2.50));

        //tesing  met

        Collections.sort(prices);




    }
}
