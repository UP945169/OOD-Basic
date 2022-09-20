package com.fdmgroup.Exercises;

public class Primitive {
    public static void main(String[] args) {
        // 1. Fav number
        int favNumber = 24;
        System.out.println(favNumber);

        // 2. Adding ints
        int number1 = 5;
        int number2 = 3;

        System.out.println(number1 + number2);

        // 3. Arithmetic
        int counter = 0;
        counter++;
        counter = counter + 5;
        counter = counter -1;
        counter = counter - 2;
        counter = counter * 2;
        System.out.println(counter);

        // 4. Dividing different ints and doubles
        int a = 5;
        int b = 2;

        double c = 5;
        double d = 2;

        System.out.println(a/b);
        System.out.println(c/d);
        System.out.println(c/b);
        System.out.println(a/d);

    }
}
