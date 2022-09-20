package com.fdmgroup.Arrarys.Exercises;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsFDM {
    public static void main(String[] args) {
        //1. Shopping basket

        ArrayList<String> shoppingBasket = new ArrayList<>();
        shoppingBasket.add("Milk");
        shoppingBasket.add("Cereals");
        shoppingBasket.add("Apples");
        shoppingBasket.add("Oranges");
        shoppingBasket.add("Bread");

        System.out.println(shoppingBasket.size());
        System.out.println(shoppingBasket.get(0));
        System.out.println(shoppingBasket.get(4));
        System.out.println("Removing Bread:");
        shoppingBasket.remove("Bread");
        System.out.println("New Items:");
        System.out.println(shoppingBasket.size());
        shoppingBasket.remove(2);
        System.out.println(shoppingBasket.get(0));
        System.out.println(shoppingBasket.get(1));
        System.out.println(shoppingBasket.get(2));
        System.out.println("Adding items  potatoes, olive oil, chicken");
        shoppingBasket.add("potatoes");
        shoppingBasket.add("olive oil");
        shoppingBasket.add("chicken");

        Collections.sort(shoppingBasket);
        System.out.println(shoppingBasket.get(0));
        System.out.println(shoppingBasket.get(5));

        //2. Salaries
        ArrayList<Integer> salaries = new ArrayList<>();

        salaries.add(75000);
        salaries.add(25000);
        salaries.add(42000);
        salaries.add(30000);
        salaries.add(55000);
        salaries.add(42000);
        salaries.add(39000);

        System.out.println(Collections.min(salaries));
        System.out.println(Collections.max(salaries));
        System.out.println(Collections.frequency(salaries, 42000));
        Collections.sort(salaries);
        System.out.println(salaries.get(2));

        System.out.println("Reverse");
        Collections.reverse(salaries);
        System.out.println(salaries.get(0));
        System.out.println(salaries.get(5));

    }
}
